# springcloud
基于Eureka注册服务提供者和消费者，使用Feign、Ribbon、Hystrix实现服务间的调用、负载均衡及服务熔断和降级功能

eureka-server  服务注册中心

eureka-consumer 消费者服务

eureka-provider 生产者服务

gateway   统一网关服务

turbine-server 聚合监控服务

zipkin-server 基本链路分析服务

zipkin-stream-server 基于RabbitMQ、Elasticsearch的链路分析服务