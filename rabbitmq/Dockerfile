FROM rabbitmq:3.7.8-management-alpine

RUN rabbitmq-plugins enable --offline rabbitmq_peer_discovery_consul
RUN rabbitmq-plugins enable rabbitmq_top

COPY rabbitmq.conf /etc/rabbitmq/

CMD [ "rabbitmq-server" ]
