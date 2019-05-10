package com.wang.core.service;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{
    @Override
    public DemoResDTO queryDemoRes(DemoReqDTO demoReqDTO) {
        return new DemoResDTO();
    }
}
