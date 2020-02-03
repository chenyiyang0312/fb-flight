package com.fh.service.impl;

import com.fh.dao.FlightDao;
import com.fh.dao.TicketDao;
import com.fh.model.Flight;
import com.fh.model.Ticket;
import com.fh.model.TicketDate;
import com.fh.service.FlightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FlightServiceImpl implements FlightService {
    @Resource
    private FlightDao flightDao;
    @Resource
    private TicketDao ticketDao;

    @Override
    public void saveManage(Flight planedata, TicketDate ticketDate) {
        if (planedata.getId()==null){
            flightDao.insert(planedata);
            Ticket ticket=new Ticket();
            ticket.setFlight_id(planedata.getId());
            ticket.setPrice(ticketDate.getPrice1());
            ticket.setType(ticketDate.getType1());
            ticket.setTotal_count(ticketDate.getTotal_count1());
            ticketDao.insert(ticket);
            Ticket ticket1=new Ticket();
            ticket1.setFlight_id(planedata.getId());
            ticket1.setPrice(ticketDate.getPrice2());
            ticket1.setType(ticketDate.getType2());
            ticket1.setTotal_count(ticketDate.getTotal_count2());
            ticketDao.insert(ticket1);
        }else{
            flightDao.updateById(planedata);
            if (ticketDate.getType1()!=null){
                Ticket ticket=new Ticket();
                ticket.setType(ticketDate.getType1());
                ticket.setTotal_count(ticketDate.getTotal_count1());
                ticket.setPrice(ticketDate.getPrice1());
                ticket.setId(ticketDate.getTicketId_1());
                ticketDao.updateById(ticket);
            }if (ticketDate.getType2()!=null){
                Ticket ticket=new Ticket();
                ticket.setType(ticketDate.getType2());
                ticket.setTotal_count(ticketDate.getTotal_count2());
                ticket.setPrice(ticketDate.getPrice2());
                ticket.setId(ticketDate.getTicketId_2());
                ticketDao.updateById(ticket);
            }
        }


    }
}
