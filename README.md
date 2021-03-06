# 当前版本V1.1
# ysframework
本项目是基于SpringBoot的REST快速开发基础框架，在thymeleafVersion分支中集成了Thymeleaf模板引擎，是非前后端分离版本。

# 简介

这个项目我是去年开始做的，断断续续写了差不多4、5个月，完善了一些基本会用到的功能和问题。这个框架基于REST风格开发，适合做前后端分离的项目。用到的技术也特别注重开发效率，都是选择了一些可以高效开发并且使用简单的技术；前段时间使用过ThinkPHP，自认为SpringBoot + JPA 这套技术的开发速度是不输PHP的，并且运行速度方面也是比PHP快很多。

# 更新说明

V1.1
SpringBoot开启Http2协议，速度更加快速了。

# 整合技术说明

> ORM框架使用Spring Data JPA

> 集成Swagger2自动生成文档。

> 集成异常统一处理、Json数据处理、消息类封装等工具类。

> 添加CORS跨域支持，解决乱码问题

> 权限框架使用自定义注解开发


# 使用说明
> 本项目使用IJ IDEA开发，Mysql数据库；使用IDEA直接打开该项目修改相应数据库配置文件（Application.yml）即可使用。

> 在cn.pxy.ysframework.web.Controller这个包下写有测试用的Controller，若想要根据这个来做一些业务，可以根据模仿这个来写。

> 关于项目具体情况我写了一篇博客来介绍。[点击跳转](https://blog.csdn.net/sheypang/article/details/100046050)
