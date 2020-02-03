package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Flight;
import com.fh.model.ForExcel;
import com.fh.model.PageData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
@Mapper
public interface FlightDao extends BaseMapper<Flight> {

    Long selectPlaneCount(PageData pageData);

    List<Map> initPlaneList(PageData pageData);

    List<ForExcel> getAllPlane(PageData pageData);

    Map<String, Object> getOnePlaneInfo(Integer id);
}
