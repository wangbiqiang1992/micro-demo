package com.wang.core.service;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;

public interface RestDemoService {

    DemoResDTO queryDemoRes(DemoReqDTO demoReqDTO);
}
