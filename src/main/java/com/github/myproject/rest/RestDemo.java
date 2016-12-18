package com.github.myproject.rest;

import com.github.myproject.dao.DemoDao;
import com.github.myproject.domain.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by xiedan on 2016/12/17.
 */
@Path("/rest")
@Controller
public class RestDemo {

    @Autowired
    private DemoDao demoDao;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/infos/{age}")
    public List<Demo> show(@PathParam("age") Integer age) {
        System.out.println("test");
        return demoDao.findByAge(age);
    }
}
