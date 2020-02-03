package com.fh.control;

import com.fh.model.ForExcel;
import com.fh.model.PageData;
import com.fh.service.PlaneTypeService;
import com.fh.util.ExcelUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@CrossOrigin(maxAge = 3600,origins = "http://localhost:8080")
@RequestMapping("plane")
public class PlaneCtl {
    @Resource
    private PlaneTypeService planeTypeService;

    @Resource
    private HttpServletResponse response;

    @RequestMapping("showPlaneType.api")
    public Map<String,Object> showPlaneType(){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",planeTypeService.showPlaneType());
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("initPlaneList.api")
    public Map<String,Object> initPlaneList(PageData pageData){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",planeTypeService.initPlaneList(pageData));
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("updateThisStatus.api")
    public Map<String,Object> updateThisStatus(Integer id){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            planeTypeService.updateThisStatus(id);
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }

    @GetMapping("exportExcel.api")
    public void exportExcel(PageData pageData){
        List<ForExcel> list=planeTypeService.getAllPlane(pageData);
        try {
            ExcelUtil.exportExcel(list,response,ForExcel.class);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("getOnePlaneInfo.api")
    public Map<String,Object> getOnePlaneInfo(Integer id){
        Map<String,Object> map=new HashMap<>();
        try {
            map.put("code",200);
            map.put("message","ok");
            map.put("data",planeTypeService.getOnePlaneInfo(id));
        }catch (Exception e){
            map.put("code",500);
            map.put("message",e.getMessage());
            e.printStackTrace();
        }
        return map;
    }
}
