package com.fh.model;

import com.fh.util.ExcelAnnotation;

import java.math.BigDecimal;
import java.util.Date;
@ExcelAnnotation(title = "航空",sheetName = "航空票")
public class ForExcel {
    @ExcelAnnotation(colomn = "航班名称")
    private String name;
    @ExcelAnnotation(colomn = "开始时间")
    private Date start_time;
    @ExcelAnnotation(colomn = "到达时间")
    private Date end_time;
    @ExcelAnnotation(colomn = "机型名称")
    private String typeName;
    @ExcelAnnotation(colomn = "票价")
    private BigDecimal price;
    @ExcelAnnotation(colomn = "票数")
    private Integer total_count;
    @ExcelAnnotation(colomn = "机票类型")
    private String planeType;
    @ExcelAnnotation(colomn = "出发地区")
    private String startArea;
    @ExcelAnnotation(colomn = "到达地区")
    private String endArea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public String getPlaneType() {
        if (planeType.equals("1")){
            planeType = "经济舱";
        }else{
            planeType="头等舱";
        }
        return planeType;
    }

    public void setPlaneType(String planeType) {
        if (planeType.equals("1")){
            planeType = "经济舱";
        }else{
            planeType="头等舱";
        }
        this.planeType = planeType;
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
