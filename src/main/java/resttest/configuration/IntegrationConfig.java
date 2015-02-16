package resttest.configuration;

import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.http.inbound.HttpRequestHandlingMessagingGateway;
import org.springframework.integration.http.inbound.IntegrationRequestMappingHandlerMapping;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import resttest.controller.IndexController;

@Configuration
@EnableIntegration
@ImportResource( "classpath:integration.xml" )
// @Import( value = { DispatcherServletAutoConfiguration.class } )
public class IntegrationConfig
    extends WebMvcConfigurationSupport
{

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping()
    {
        RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
        handlerMapping.setOrder( 100 );
        handlerMapping.setInterceptors( getInterceptors() );
        handlerMapping.setContentNegotiationManager( mvcContentNegotiationManager() );

        PathMatchConfigurer configurer = getPathMatchConfigurer();
        if ( configurer.isUseSuffixPatternMatch() != null )
        {
            handlerMapping.setUseSuffixPatternMatch( configurer.isUseSuffixPatternMatch() );
        }
        if ( configurer.isUseRegisteredSuffixPatternMatch() != null )
        {
            handlerMapping.setUseRegisteredSuffixPatternMatch( configurer.isUseRegisteredSuffixPatternMatch() );
        }
        if ( configurer.isUseTrailingSlashMatch() != null )
        {
            handlerMapping.setUseTrailingSlashMatch( configurer.isUseTrailingSlashMatch() );
        }
        if ( configurer.getPathMatcher() != null )
        {
            handlerMapping.setPathMatcher( configurer.getPathMatcher() );
        }
        if ( configurer.getUrlPathHelper() != null )
        {
            handlerMapping.setUrlPathHelper( configurer.getUrlPathHelper() );
        }

        return handlerMapping;
    }

    /*
     * @Bean public IndexController indexController() { return new IndexController(); }
     */

    /*
     * @Bean public ServletRegistrationBean httpInbound() { HttpRequestHandlerServlet servlet = new
     * HttpRequestHandlerServlet(); return new ServletRegistrationBean( servlet, "/" ); }
     */
    /*
     * @Bean public HttpRequestHandler integrationRequestHandler() { HttpRequestHandlingMessagingGateway requestHandler
     * = new HttpRequestHandlingMessagingGateway(); requestHandler.setReplyChannelName( "httpReplyChannel" );
     * requestHandler.setRequestChannelName( "httpRequestChannel" ); return requestHandler; }
     */

    /*
     * @Bean public IndexController index() { return new IndexController(); }
     */
}
