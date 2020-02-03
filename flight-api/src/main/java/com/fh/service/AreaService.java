package com.fh.service;

import com.fh.model.Area;

import java.util.List;

public interface AreaService {
    List<Area> initArea(Integer areaId);

    List<Area> initplaneAir(Integer areaId);

    List<Area> initplanefloor(Integer areaId);
}
