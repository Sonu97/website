FROM devopsedu/webapp
ADD proj /var/www/html
RUN rm /var/html/index.html
CMD apachectl -D FOREGROUND
