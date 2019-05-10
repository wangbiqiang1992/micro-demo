package com.wang.core.test;

import com.wang.core.dto.DemoReqDTO;
import com.wang.core.dto.DemoResDTO;
import com.wang.core.service.DemoService;
import com.wang.test.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceTest extends BaseTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void testDemoService(){
        DemoResDTO demoResDTO = demoService.queryDemoRes(new DemoReqDTO());
        Assert.assertNotNull(demoResDTO);
    }

}
