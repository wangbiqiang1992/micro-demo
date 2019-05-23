package com.wang.core.service;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;
import org.springframework.stereotype.Service;
import wang.boot.starter.dubbo.filter.annotations.LogMethod;

/**
 * @author Administrator
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    @Override
    @LogMethod
    public DemoResDTO queryDemoRes(DemoReqDTO demoReqDTO) {
        DemoResDTO demoResDTO = new DemoResDTO();
        demoResDTO.setBusiness1(demoReqDTO.getBusiness1());
        return demoResDTO;
    }
}
