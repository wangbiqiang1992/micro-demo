package com.wang.core.dto;

import javax.ws.rs.FormParam;
import java.io.Serializable;

/**
 * @author Administrator
 */
public class DemoReqDTO implements Serializable {

    private String business1;

    public String getBusiness1() {
        return business1;
    }

    public void setBusiness1(String business1) {
        this.business1 = business1;
    }
}
