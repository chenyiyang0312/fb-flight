package com.fh.model;

import com.fh.bean.PageBean;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Map;
public class PageData extends PageBean<Map> {

    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    private Integer air;

    private Integer hasTicket;

    private Integer type;

    private Integer typeId;

    private String startArea;

    private String endArea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getAir() {
        return air;
    }

    public void setAir(Integer air) {
        this.air = air;
    }

    public Integer getHasTicket() {
        return hasTicket;
    }

    public void setHasTicket(Integer hasTicket) {
        this.hasTicket = hasTicket;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getStartArea() {
        return startArea;
    }

    public void setStartArea(String startArea) {
        this.startArea = startArea;
    }

    public String getEndArea() {
        return endArea;
    }

    public void setEndArea(String endArea) {
        this.endArea = endArea;
    }
}
