package com.fh.model;

import java.math.BigDecimal;
/*飞机票详细数据*/
public class TicketDate {


    private Integer total_count1;

    private Integer total_count2;

    private BigDecimal price1;
    private BigDecimal price2;

    private Integer ticketId_2;

    private Integer ticketId_1;

    private Integer type1;

    private Integer type2;

    public Integer getTicketId_2() {
        return ticketId_2;
    }

    public void setTicketId_2(Integer ticketId_2) {
        this.ticketId_2 = ticketId_2;
    }

    public Integer getTicketId_1() {
        return ticketId_1;
    }

    public void setTicketId_1(Integer ticketId_1) {
        this.ticketId_1 = ticketId_1;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
    }


    public Integer getTotal_count1() {
        return total_count1;
    }

    public void setTotal_count1(Integer total_count1) {
        this.total_count1 = total_count1;
    }

    public Integer getTotal_count2() {
        return total_count2;
    }

    public void setTotal_count2(Integer total_count2) {
        this.total_count2 = total_count2;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }
}
