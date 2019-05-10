package com.wang.core.service;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;

/**
 * @author Administrator
 */
public interface DemoService {

    DemoResDTO queryDemoRes(DemoReqDTO demoReqDTO);
}
