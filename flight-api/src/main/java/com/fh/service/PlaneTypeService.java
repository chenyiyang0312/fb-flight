package com.fh.service;

import com.fh.model.ForExcel;
import com.fh.model.PageData;
import com.fh.model.PlaneType;

import java.util.List;
import java.util.Map;
public interface PlaneTypeService {
    List<PlaneType> showPlaneType();

    PageData initPlaneList(PageData pageData);

    void updateThisStatus(Integer id);

    List<ForExcel> getAllPlane(PageData pageData);

    Map<String,Object> getOnePlaneInfo(Integer id);
}
