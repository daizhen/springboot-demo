package com.example.demo.controller;

import com.example.demo.jpa.MapJpa;
import com.example.demo.model.MapEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Map")
public class MapController {

    @Autowired
    private MapJpa mapJpa;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<MapEntity> list()
    {
        List<MapEntity> result =   mapJpa.findAll();
        return result;
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public MapEntity save(MapEntity mapEntity)
    {
        return mapJpa.save(mapEntity);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public  void delete(String mapId)
    {
        mapJpa.deleteById(mapId);

    }

}
