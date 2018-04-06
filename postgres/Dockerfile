FROM postgres:10.3-alpine

RUN apk update && apk add curl util-linux bash

ADD /resources/config.sql /docker-entrypoint-initdb.d/
ADD /resources/docker-entrypoint.sh /usr/local/bin/
ADD /resources/init-user-db.sh /docker-entrypoint-initdb.d/

RUN chmod +x /usr/local/bin/docker-entrypoint.sh
