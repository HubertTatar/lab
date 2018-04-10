FROM postgres:10.3-alpine

RUN apk update && apk add curl util-linux bash

#RUN wget  https://releases.hashicorp.com/consul/1.0.6/consul_1.0.6_linux_amd64.zip
#RUN mkdir -p /opt/consul
#RUN unzip consul_1.0.6_linux_amd64.zip -d /opt/consul

ADD /resources/config.sql /docker-entrypoint-initdb.d/
ADD /resources/docker-entrypoint.sh /usr/local/bin/
ADD /resources/init-user-db.sh /docker-entrypoint-initdb.d/
#ADD /resources/services.json /opt/consul/

RUN chmod +x /usr/local/bin/docker-entrypoint.sh
