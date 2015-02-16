package resttest.controller;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController
{
    @RequestMapping( value = "/", method = RequestMethod.GET )
    public String testGateway( String jSon )
    {

        System.out.println( "Starting process the message [reciveing]" );

        return "{HelloMessage: \"Hello\"}";
    }
}
