package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
/*航班表*/
@TableName("t_flight")
public class Flight {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField("name")
    private String name;
    @TableField("type_id")
    private Integer type_id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("start_time")
    private Date start_time;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("end_time")
    private Date end_time;
    @TableField("start_1_id")
    private Integer start_1_id;
    @TableField("start_2_id")
    private Integer start_2_id;
    @TableField("start_3_id")
    private Integer start_3_id;
    @TableField("end_1_id")
    private Integer end_1_id;
    @TableField("end_2_id")
    private Integer end_2_id;
    @TableField("end_3_id")
    private Integer end_3_id;

    public Integer getStart_1_id() {
        return start_1_id;
    }

    public void setStart_1_id(Integer start_1_id) {
        this.start_1_id = start_1_id;
    }

    public Integer getStart_2_id() {
        return start_2_id;
    }

    public void setStart_2_id(Integer start_2_id) {
        this.start_2_id = start_2_id;
    }

    public Integer getStart_3_id() {
        return start_3_id;
    }

    public void setStart_3_id(Integer start_3_id) {
        this.start_3_id = start_3_id;
    }

    public Integer getEnd_1_id() {
        return end_1_id;
    }

    public void setEnd_1_id(Integer end_1_id) {
        this.end_1_id = end_1_id;
    }

    public Integer getEnd_2_id() {
        return end_2_id;
    }

    public void setEnd_2_id(Integer end_2_id) {
        this.end_2_id = end_2_id;
    }

    public Integer getEnd_3_id() {
        return end_3_id;
    }

    public void setEnd_3_id(Integer end_3_id) {
        this.end_3_id = end_3_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
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
}