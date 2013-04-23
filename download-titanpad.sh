#!/bin/sh -x

# People didn't trust titanpad it seems.
# Let's make some backups

while true ; do
   wget http://titanpad.com/ep/pad/export/0pe8lQpEP8/latest?format=txt \
   -O titanpad-backup.txt
   git commit -a -m "Automatically committed a new copy of titanpad"
   git push
   sleep 120
done
