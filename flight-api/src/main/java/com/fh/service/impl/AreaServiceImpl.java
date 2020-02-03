package com.fh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.dao.AreaDao;
import com.fh.model.Area;
import com.fh.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Resource
    private AreaDao areaDao;

    @Override
    public List<Area> initArea(Integer areaId) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("type",0);
        if (areaId!=null){
            wrapper.notIn("id",areaId);
        }
        return areaDao.selectList(wrapper);
    }

    @Override
    public List<Area> initplaneAir(Integer areaId) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("type",1);
        wrapper.eq("pid",areaId);
        return areaDao.selectList(wrapper);
    }

    @Override
    public List<Area> initplanefloor(Integer areaId) {
        QueryWrapper wrapper=new QueryWrapper();
        wrapper.eq("type",2);
        wrapper.eq("pid",areaId);
        return areaDao.selectList(wrapper);
    }
}
