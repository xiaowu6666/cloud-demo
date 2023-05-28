这是一个Spring微服务的云原生实践

### 如何运行项目

下载源码、编译
> cd book
>mvn package

使用docker 制作镜像
> docker build . -t book:1.0v

使用kubectl 创建deployment、ClusterIP、NodePort 这些资源， author模板也是相同方式即可
`curl localhost:30001/book/getOne` 就可以访问到NodePort 转发出来的接口
