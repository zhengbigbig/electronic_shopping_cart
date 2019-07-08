package com.company.electronic_shopping_cart.web.session.controller;

import com.company.electronic_shopping_cart.web.session.model.Session;
import com.company.electronic_shopping_cart.web.session.model.SessionManager;
import com.company.electronic_shopping_cart.web.session.view.LoginRequest;
import com.company.electronic_shopping_cart.web.user.model.User;
import com.company.electronic_shopping_cart.web.user.model.UserDao;
import com.company.electronic_shopping_cart.web.user.view.UserView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class SessionController {

    private static final String SESSION_TOKEN = "session_token";
    private static final String USER_ID = "user_id";

    private UserDao userDao;
    private SessionManager sessionManager;

    public SessionController(UserDao userDao, SessionManager sessionManager) {
        this.userDao = userDao;
        this.sessionManager = sessionManager;
    }

    /**
     * Login
     */
    @PostMapping("/session")
    public ResponseEntity login(HttpServletResponse response, @RequestBody LoginRequest login) {
        User user = userDao.getByName(login.getUsername());
        if (user == null || !user.getPassword().equals(login.getPassword())) {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

        // 添加Session
        String token = UUID.randomUUID().toString(); // 随机数
        sessionManager.getSessions().put(
                user.getId(), new Session(user.getId(), token)
        );

        // 设置Cookie
        response.addCookie(new Cookie(USER_ID,Long.toString(user.getId())));
        response.addCookie(new Cookie(SESSION_TOKEN,token));

        return new ResponseEntity(HttpStatus.CREATED);
    }

    /**
     * current user
     */
    @GetMapping("/current")
    public ResponseEntity<UserView> current(@CookieValue(name = USER_ID,defaultValue = "0") long userId,@CookieValue(name = SESSION_TOKEN,defaultValue = "") String token){
        Session session = sessionManager.getSessions().get(userId);

        if(session == null || !session.getToken().equals(token)){
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        }

        // 认证成功
        User user = userDao.getById(session.getUserId());
        return new ResponseEntity<>(new UserView(user.getId(),user.getName()),HttpStatus.OK);
    }

    /**
     * Logout
     */
    @DeleteMapping("/session")
    public ResponseEntity logout(@CookieValue(name = USER_ID,defaultValue = "") long userId,@CookieValue(name = SESSION_TOKEN,defaultValue = "") String token){
        Session session = sessionManager.getSessions().get(userId);

        if(session == null || !session.getToken().equals(token)){
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        // 删除Session
        sessionManager.getSessions().remove(userId);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
