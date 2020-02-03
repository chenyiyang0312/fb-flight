package com.fh.service.impl;

import com.fh.dao.FlightDao;
import com.fh.dao.PlaneTypeDao;
import com.fh.model.ForExcel;
import com.fh.model.PageData;
import com.fh.model.PlaneType;
import com.fh.service.PlaneTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class PlaneTypeServiceImpl implements PlaneTypeService {
    @Resource
    private PlaneTypeDao planeTypeDao;
    @Resource
    private FlightDao flightDao;
    @Override
    public List<PlaneType> showPlaneType() {
        return planeTypeDao.selectList(null);
    }

    @Override
    public PageData initPlaneList(PageData pageData) {
        Long aLong = flightDao.selectPlaneCount(pageData);
        pageData.setTotal(Integer.valueOf(String.valueOf(aLong)));
        pageData.calculate();
        pageData.setList(flightDao.initPlaneList(pageData));
        return pageData;
    }

    @Override
    public void updateThisStatus(Integer id) {
        flightDao.deleteById(id);
    }

    @Override
    public List<ForExcel> getAllPlane(PageData pageData) {
        return flightDao.getAllPlane(pageData);
    }

    @Override
    public Map<String, Object> getOnePlaneInfo(Integer id) {

        return flightDao.getOnePlaneInfo(id);
    }
}
