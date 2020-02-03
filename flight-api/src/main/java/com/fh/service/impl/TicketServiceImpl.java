package com.fh.service.impl;

import com.fh.dao.TicketDao;
import com.fh.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service
public class TicketServiceImpl implements TicketService {
    @Resource
    private TicketDao ticketDao;
    @Override
    public void updateThisStatus(Integer id) {
        ticketDao.deleteById(id);
    }

    @Override
    public Integer updateThisTicketCount(Integer id) {

        return ticketDao.updateThisTicketCount(id);
    }
}
