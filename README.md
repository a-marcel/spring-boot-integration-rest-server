# spring-boot-integration-rest-server
Spring Boot REST Server based on Spring Integration HTTP

# Startup Log

```
[resttest] [INFO ] 2015-02-16 22:41:07,736 [main] [r.ResttestApplication] [] [] - Starting ResttestApplication on xxx with PID 1 
[resttest] [INFO ] 2015-02-16 22:41:07,792 [main] [o.s.b.c.e.AnnotationConfigEmbeddedWebApplicationContext] [] [] - Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@20deea7f: startup date [Mon Feb 16 22:41:07 CET 2015]; root of context hierarchy
[resttest] [INFO ] 2015-02-16 22:41:08,415 [main] [o.s.b.f.x.XmlBeanDefinitionReader] [] [] - Loading XML bean definitions from class path resource [integration.xml]
[resttest] [INFO ] 2015-02-16 22:41:08,710 [main] 
[resttest] [INFO ] 2015-02-16 22:41:08,717 [main] [o.s.i.c.IntegrationRegistrar] [] [] - No bean named 'integrationHeaderChannelRegistry' has been explicitly defined. Therefore, a default DefaultHeaderChannelRegistry will be created.
[resttest] [INFO ] 2015-02-16 22:41:09,091 [main] [o.s.i.c.DefaultConfiguringBeanFactoryPostProcessor] [] [] - No bean named 'errorChannel' has been explicitly defined. Therefore, a default PublishSubscribeChannel will be created.
[resttest] [INFO ] 2015-02-16 22:41:09,092 [main] [o.s.i.c.DefaultConfiguringBeanFactoryPostProcessor] [] [] - No bean named 'taskScheduler' has been explicitly defined. Therefore, a default ThreadPoolTaskScheduler will be created.
[resttest] [INFO ] 2015-02-16 22:41:09,168 [main] [o.h.v.i.u.Version] [] [] - HV000001: Hibernate Validator 5.1.3.Final
[resttest] [INFO ] 2015-02-16 22:41:09,420 [main] [o.s.b.f.c.PropertiesFactoryBean] [] [] - Loading properties file from URL [jar:file:/Users/marcelalburg/.m2/repository/org/springframework/integration/spring-integration-core/4.1.2.RELEASE/spring-integration-core-4.1.2.RELEASE.jar!/META-INF/spring.integration.default.properties]
[resttest] [INFO ] 2015-02-16 22:41:09,421 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean 'integrationGlobalProperties' of type [class org.springframework.beans.factory.config.PropertiesFactoryBean] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,421 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean 'integrationGlobalProperties' of type [class java.util.Properties] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,424 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean 'messageBuilderFactory' of type [class org.springframework.integration.support.DefaultMessageBuilderFactory] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,498 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean '(inner bean)#51df223b' of type [class org.springframework.integration.channel.MessagePublishingErrorHandler] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,499 [main] [o.s.s.c.ThreadPoolTaskScheduler] [] [] - Initializing ExecutorService  'taskScheduler'
[resttest] [INFO ] 2015-02-16 22:41:09,499 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean 'taskScheduler' of type [class org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,499 [main] [o.s.c.s.PostProcessorRegistrationDelegate$BeanPostProcessorChecker] [] [] - Bean 'integrationHeaderChannelRegistry' of type [class org.springframework.integration.channel.DefaultHeaderChannelRegistry] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
[resttest] [INFO ] 2015-02-16 22:41:09,915 [main] [o.s.b.c.e.j.JettyEmbeddedServletContainerFactory] [] [] - Server initialized with port: 8002
[resttest] [INFO ] 2015-02-16 22:41:09,922 [main] [o.e.j.s.Server] [] [] - jetty-9.2.4.v20141103
[resttest] [INFO ] 2015-02-16 22:41:10,082 [main] [/] [] [] - Initializing Spring embedded WebApplicationContext
[resttest] [INFO ] 2015-02-16 22:41:10,083 [main] [o.s.w.c.ContextLoader] [] [] - Root WebApplicationContext: initialization completed in 2297 ms
[resttest] [INFO ] 2015-02-16 22:41:10,299 [main] [o.s.b.c.e.ServletRegistrationBean] [] [] - Mapping servlet: 'dispatcherServlet' to [/]
[resttest] [INFO ] 2015-02-16 22:41:10,302 [main] [o.s.b.c.e.FilterRegistrationBean] [] [] - Mapping filter: 'characterEncodingFilter' to: [/*]
[resttest] [INFO ] 2015-02-16 22:41:10,663 [main] [o.e.j.s.h.ContextHandler] [] [] - Started o.s.b.c.e.j.JettyEmbeddedWebAppContext@6dd93a21{/,null,AVAILABLE}
[resttest] [INFO ] 2015-02-16 22:41:10,663 [main] [o.e.j.s.Server] [] [] - Started @4806ms
[resttest] [INFO ] 2015-02-16 22:41:10,901 [main] [o.s.w.s.m.m.a.RequestMappingHandlerMapping] [] [] - Mapped "{[/],methods=[GET],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public java.lang.String resttest.controller.IndexController.testGateway(java.lang.String)
[resttest] [INFO ] 2015-02-16 22:41:10,906 [main] [o.s.w.s.m.m.a.RequestMappingHandlerMapping] [] [] - Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[],custom=[]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
[resttest] [INFO ] 2015-02-16 22:41:10,907 [main] [o.s.w.s.m.m.a.RequestMappingHandlerMapping] [] [] - Mapped "{[/error],methods=[],params=[],headers=[],consumes=[],produces=[text/html],custom=[]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest)
[resttest] [INFO ] 2015-02-16 22:41:11,342 [main] [o.s.w.s.m.m.a.RequestMappingHandlerAdapter] [] [] - Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@20deea7f: startup date [Mon Feb 16 22:41:07 CET 2015]; root of context hierarchy
[resttest] [INFO ] 2015-02-16 22:41:11,791 [main] [o.s.j.e.a.AnnotationMBeanExporter] [] [] - Registering beans for JMX exposure on startup
[resttest] [INFO ] 2015-02-16 22:41:11,802 [main] [o.s.j.e.a.AnnotationMBeanExporter] [] [] - Bean with name 'org.springframework.integration.channel.interceptor.WireTap#0' has been autodetected for JMX exposure
[resttest] [INFO ] 2015-02-16 22:41:11,803 [main] [o.s.j.e.a.AnnotationMBeanExporter] [] [] - Bean with name 'org.springframework.integration.channel.interceptor.WireTap#1' has been autodetected for JMX exposure
[resttest] [INFO ] 2015-02-16 22:41:11,807 [main] [o.s.j.e.a.AnnotationMBeanExporter] [] [] - Located managed bean 'org.springframework.integration.channel.interceptor.WireTap#0': registering with JMX server as MBean [org.springframework.integration.channel.interceptor:name=org.springframework.integration.channel.interceptor.WireTap#0,type=WireTap]
[resttest] [INFO ] 2015-02-16 22:41:11,827 [main] [o.s.j.e.a.AnnotationMBeanExporter] [] [] - Located managed bean 'org.springframework.integration.channel.interceptor.WireTap#1': registering with JMX server as MBean [org.springframework.integration.channel.interceptor:name=org.springframework.integration.channel.interceptor.WireTap#1,type=WireTap]
[resttest] [INFO ] 2015-02-16 22:41:11,835 [main] [o.s.c.s.DefaultLifecycleProcessor] [] [] - Starting beans in phase -2147483648
[resttest] [INFO ] 2015-02-16 22:41:11,837 [main] [o.s.c.s.DefaultLifecycleProcessor] [] [] - Starting beans in phase 0
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - Adding {logging-channel-adapter:logHttpRequestChannel.adapter} as a subscriber to the 'logHttpRequestChannel' channel
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.c.DirectChannel] [] [] - Channel 'resttest:8002.logHttpRequestChannel' has 1 subscriber(s).
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - started logHttpRequestChannel.adapter
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - Adding {logging-channel-adapter:logHttpReplyChannel.adapter} as a subscriber to the 'logHttpReplyChannel' channel
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.c.DirectChannel] [] [] - Channel 'resttest:8002.logHttpReplyChannel' has 1 subscriber(s).
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - started logHttpReplyChannel.adapter
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.h.i.HttpRequestHandlingMessagingGateway] [] [] - started inboundGateway
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - Adding {logging-channel-adapter:_org.springframework.integration.errorLogger} as a subscriber to the 'errorChannel' channel
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.c.PublishSubscribeChannel] [] [] - Channel 'resttest:8002.errorChannel' has 1 subscriber(s).
[resttest] [INFO ] 2015-02-16 22:41:11,838 [main] [o.s.i.e.EventDrivenConsumer] [] [] - started _org.springframework.integration.errorLogger
[resttest] [INFO ] 2015-02-16 22:41:11,840 [main] [o.s.i.h.i.IntegrationRequestMappingHandlerMapping] [] [] - Mapped "{[/],methods=[GET],params=[],headers=[],consumes=[],produces=[application/json],custom=[]}" onto public abstract void org.springframework.web.HttpRequestHandler.handleRequest(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse) throws javax.servlet.ServletException,java.io.IOException
[resttest] [INFO ] 2015-02-16 22:41:11,850 [main] [/] [] [] - Initializing Spring FrameworkServlet 'dispatcherServlet'
[resttest] [INFO ] 2015-02-16 22:41:11,851 [main] [o.s.w.s.DispatcherServlet] [] [] - FrameworkServlet 'dispatcherServlet': initialization started
[resttest] [INFO ] 2015-02-16 22:41:11,869 [main] [o.s.w.s.DispatcherServlet] [] [] - FrameworkServlet 'dispatcherServlet': initialization completed in 18 ms
[resttest] [INFO ] 2015-02-16 22:41:11,973 [main] [o.e.j.s.ServerConnector] [] [] - Started ServerConnector@26d96e5{HTTP/1.1}{0.0.0.0:8002}
[resttest] [INFO ] 2015-02-16 22:41:11,979 [main] [o.s.b.c.e.j.JettyEmbeddedServletContainer] [] [] - Jetty started on port(s) 8002 (http/1.1)
[resttest] [INFO ] 2015-02-16 22:41:11,982 [main] [r.ResttestApplication] [] [] - Started ResttestApplication in 4.756 seconds (JVM running for 6.125)
```
