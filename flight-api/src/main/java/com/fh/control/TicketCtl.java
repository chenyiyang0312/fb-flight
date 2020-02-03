package com.fh.control;

import com.fh.service.TicketService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
@RequestMapping("ticket")
public class TicketCtl {

    @Resource
    private TicketService ticketService;

    @RequestMapping("updateThisStatus.api")
    public Map<String,Object> updateThisStatus(Integer id){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            ticketService.updateThisStatus(id);
            map.put("message","ok");
        }catch (Exception e){
            e.printStackTrace();
            map.put("code",500);
            map.put("message",e.getMessage());
        }
        return map;
    }
    @RequestMapping("updateThisTicketCount.api")
    public Map<String,Object> updateThisTicketCount(Integer id){
        Map<String,Object> map=new HashMap<>();
        try {
            Integer integer = ticketService.updateThisTicketCount(id);
            if (integer!=0){
                map.put("code",200);
                map.put("message","ok");
            }else{
                map.put("code",201);
                map.put("message","没票了");
            }

        }catch (Exception e){
            e.printStackTrace();
            map.put("code",500);
            map.put("message",e.getMessage());
        }
        return map;
    }

}
