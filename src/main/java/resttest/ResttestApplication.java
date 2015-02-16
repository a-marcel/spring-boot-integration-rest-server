package resttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration( exclude = { WebMvcAutoConfiguration.class } )
@SpringBootApplication
public class ResttestApplication
{
    public static void main( String[] args )
    {
        final ConfigurableApplicationContext springContext = SpringApplication.run( ResttestApplication.class, args );
    }
}
