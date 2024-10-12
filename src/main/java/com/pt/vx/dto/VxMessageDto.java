package com.pt.vx.dto;

import com.pt.vx.entity.DataInfo;

import java.util.Map;

public class VxMessageDto {

    private String touser;

    private String template_id;

    private Map<String, DataInfo> data;


    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public Map<String, DataInfo> getData() {
        return data;
    }

    public void setData(Map<String, DataInfo> data) {
        this.data = data;
    }
}
