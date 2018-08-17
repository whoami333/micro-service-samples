A simple RESTful server that register itself to consul server.

启动producer的两个副本，提供负载均衡的服务：
```shell
java -jar build/libs/consul-producer-0.0.1-SNAPSHOT.jar --server.port=8080
java -jar build/libs/consul-producer-0.0.1-SNAPSHOT.jar --server.port=9090
```
