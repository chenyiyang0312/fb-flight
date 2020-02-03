package com.fh.control;

import com.fh.model.Flight;
import com.fh.model.TicketDate;
import com.fh.service.FlightService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("flight")
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
public class FlightCtl {
    @Resource
    private FlightService flightService;

    @RequestMapping("saveManage.api")
    public Map<String,Object> saveManage(Flight planedata, TicketDate ticketDate){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            flightService.saveManage(planedata,ticketDate);
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
}
