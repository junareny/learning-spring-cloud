启动zk

启动Kafka

启动程序

访问

http://localhost:7888/send/zhang3

sender

    ssl.truststore.type = JKS
    transaction.timeout.ms = 60000
    transactional.id = null
    value.serializer = class org.apache.kafka.common.serialization.ByteArraySerializer


2020-05-26 20:28:21.090  INFO 17300 --- [nio-7888-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 2.3.1  
2020-05-26 20:28:21.091  INFO 17300 --- [nio-7888-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: 18a913733fb71c01  
2020-05-26 20:28:21.091  INFO 17300 --- [nio-7888-exec-4] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1590496101090  
2020-05-26 20:28:21.104  INFO 17300 --- [ad | producer-2] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-2] Cluster ID: uqRkSs4PTAiGNhuv2I4OeA  

Reciever1

zhang3


Reciever2

zhang3

