# spring-boot-integration-rest-server
Spring Boot REST Server based on Spring Integration HTTP

# For Testing
```
mvn spring-boot:run
```

after that, call:

```
curl -D - "http://127.0.0.1:8002/"
```


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


Calling "/"
```
[resttest] [INFO ] 2015-02-16 22:41:32,369 [qtp866273692-22] [httpRequestChannel] [] [] - GenericMessage [payload={}, headers={http_requestMethod=GET, replyChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@57fd4a42, errorChannel=org.springframework.messaging.core.GenericMessagingTemplate$TemporaryReplyChannel@57fd4a42, Accept=*/*, User-Agent=curl/7.37.1, http_requestUrl=http://127.0.0.1:8002/, Host=127.0.0.1:8002, id=608f9506-aa2a-d3eb-6ccd-d5a63c006e09, timestamp=1424122892368}]
[resttest] [WARN ] 2015-02-16 22:41:32,373 [qtp866273692-22] [o.e.j.s.ServletHandler] [] [] - 
org.springframework.web.util.NestedServletException: Request processing failed; nested exception is org.springframework.messaging.MessageDeliveryException: Dispatcher has no subscribers for channel 'resttest:8002.httpRequestChannel'.; nested exception is org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:978) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:857) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:687) ~[javax.servlet-api-3.1.0.jar:3.1.0]
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:842) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:790) ~[javax.servlet-api-3.1.0.jar:3.1.0]
	at org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:800) ~[jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1669) ~[jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.websocket.server.WebSocketUpgradeFilter.doFilter(WebSocketUpgradeFilter.java:224) ~[websocket-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1652) ~[jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:88) ~[spring-web-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:107) ~[spring-web-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.eclipse.jetty.servlet.ServletHandler$CachedChain.doFilter(ServletHandler.java:1652) ~[jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:585) [jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:143) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:577) [jetty-security-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:223) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1125) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:515) [jetty-servlet-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:185) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1059) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:97) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.Server.handle(Server.java:497) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:310) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:248) [jetty-server-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.io.AbstractConnection$2.run(AbstractConnection.java:540) [jetty-io-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:620) [jetty-util-9.2.4.v20141103.jar:9.2.4.v20141103]
	at org.eclipse.jetty.util.thread.QueuedThreadPool$3.run(QueuedThreadPool.java:540) [jetty-util-9.2.4.v20141103.jar:9.2.4.v20141103]
	at java.lang.Thread.run(Thread.java:745) [?:1.8.0_25]
Caused by: org.springframework.messaging.MessageDeliveryException: Dispatcher has no subscribers for channel 'resttest:8002.httpRequestChannel'.; nested exception is org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers
	at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:81) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:277) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:115) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSendAndReceive(GenericMessagingTemplate.java:150) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSendAndReceive(GenericMessagingTemplate.java:45) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.AbstractMessagingTemplate.sendAndReceive(AbstractMessagingTemplate.java:42) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.integration.gateway.MessagingGatewaySupport.doSendAndReceive(MessagingGatewaySupport.java:357) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.gateway.MessagingGatewaySupport.sendAndReceiveMessage(MessagingGatewaySupport.java:328) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingEndpointSupport.actualDoHandleRequest(HttpRequestHandlingEndpointSupport.java:492) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingEndpointSupport.doHandleRequest(HttpRequestHandlingEndpointSupport.java:389) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingMessagingGateway.handleRequest(HttpRequestHandlingMessagingGateway.java:103) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter.handle(HttpRequestHandlerAdapter.java:51) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:943) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:877) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:966) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	... 28 more
Caused by: org.springframework.integration.MessageDispatchingException: Dispatcher has no subscribers
	at org.springframework.integration.dispatcher.UnicastingDispatcher.doDispatch(UnicastingDispatcher.java:107) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.dispatcher.UnicastingDispatcher.dispatch(UnicastingDispatcher.java:97) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.channel.AbstractSubscribableChannel.doSend(AbstractSubscribableChannel.java:77) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.channel.AbstractMessageChannel.send(AbstractMessageChannel.java:277) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSend(GenericMessagingTemplate.java:115) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSendAndReceive(GenericMessagingTemplate.java:150) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.GenericMessagingTemplate.doSendAndReceive(GenericMessagingTemplate.java:45) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.messaging.core.AbstractMessagingTemplate.sendAndReceive(AbstractMessagingTemplate.java:42) ~[spring-messaging-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.integration.gateway.MessagingGatewaySupport.doSendAndReceive(MessagingGatewaySupport.java:357) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.gateway.MessagingGatewaySupport.sendAndReceiveMessage(MessagingGatewaySupport.java:328) ~[spring-integration-core-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingEndpointSupport.actualDoHandleRequest(HttpRequestHandlingEndpointSupport.java:492) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingEndpointSupport.doHandleRequest(HttpRequestHandlingEndpointSupport.java:389) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.integration.http.inbound.HttpRequestHandlingMessagingGateway.handleRequest(HttpRequestHandlingMessagingGateway.java:103) ~[spring-integration-http-4.1.2.RELEASE.jar:?]
	at org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter.handle(HttpRequestHandlerAdapter.java:51) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:943) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:877) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:966) ~[spring-webmvc-4.1.5.BUILD-SNAPSHOT.jar:4.1.5.BUILD-SNAPSHOT]
	... 28 more

```
