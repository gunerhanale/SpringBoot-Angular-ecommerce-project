# Set nginx base image
FROM nginx:alpine-perl

LABEL maintainer="Ebubekir Gunerhanal"

EXPOSE 4200
## Remove default Nginx website
RUN rm -rf /usr/share/nginx/html/*

RUN rm /etc/nginx/conf.d/default.conf

ADD ./nginx/nginx.conf /etc/nginx/nginx.conf

ADD . /usr/share/nginx/html 


