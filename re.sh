#!/bin/bash
echo $RANDOM >> 1.txt
git add .
git commit -m "update"
git push

exit 0