package com.github.myproject.rest;

import com.github.myproject.dao.DemoDao;
import com.github.myproject.domain.Demo;
import com.github.myproject.domain.Message;
import com.github.myproject.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/rest")
@Controller
public class RestResource {

    @Autowired
    private MessageService messageService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hello")
    public String hello() {
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/messages")
    public List<Message> message() {
        return messageService.getMessages();
    }


}
