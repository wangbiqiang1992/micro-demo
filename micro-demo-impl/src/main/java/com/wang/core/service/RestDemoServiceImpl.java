package com.wang.core.service;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;
import org.springframework.stereotype.Service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 * @author Administrator
 */
@Path("/rest")
public class RestDemoServiceImpl implements RestDemoService {
    @Override
    @Path("/demo")
    @GET
    @Produces("application/json; charset=UTF-8")
    public DemoResDTO queryDemoRes(@BeanParam DemoReqDTO demoReqDTO) {
        DemoResDTO demoResDTO = new DemoResDTO();
        demoResDTO.setBusiness1(demoReqDTO.getBusiness1());
        return demoResDTO;
    }
}
