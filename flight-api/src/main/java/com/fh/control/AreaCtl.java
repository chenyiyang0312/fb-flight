package com.fh.control;

import com.fh.service.AreaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("area")
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
public class AreaCtl {
    @Resource
    private AreaService areaService;

    @RequestMapping("initArea.api")
    public Map<String,Object> initArea(Integer areaId){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",areaService.initArea(areaId));
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
    @RequestMapping("initplaneAir.api")
    public Map<String,Object> initplaneAir(Integer areaId){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",areaService.initplaneAir(areaId));
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("initplanefloor.api")
    public Map<String,Object> initplanefloor(Integer areaId){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",areaService.initplanefloor(areaId));
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
}
