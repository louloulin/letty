# letty规划方向
### 目标高性能的web服务器,目标最求极致的的性能

### 开发规划
1. 实现基于netty的web服务器的基本功能,支持各种请类型的请求(get,post,put...)

2. 支持请求参数的解释,querystring和参数绑定功能,表单参数解析功能

3. 支持文件的上传下载,session,cookie的支持

4. 支持多级路由策略

5. 支持静态文件服务器

6. 支持middleware模式(类似于express,koa中的middleware,类似于java中的拦截器)

7. 支持参数教研功能,支持XML, JSON, YAML and ProtoBuf rendering

8. 支持轻量级的模板(如果groovy模板html template)

9. 一些默认middleware的开发,如log,auth

10. 支持testing功能,多种性能测试功能

11. 提供默认的轻量级的web服务,基本功能都能提供

### 开发其他说明
1. 支持JDK1.8及以上版本

2. 支持常规java(spring web方式)方式,同时支持lamada表示(及函数式编程)(默认使用函数编程)

3. 模板引擎规划可能使用groovy

4. 支持热启动方式,支持动态加载

### 规划时间


  