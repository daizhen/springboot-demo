package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="map")
public class MapEntity implements Serializable{

    @Id
    @Column(name = "MapID")
    private String MapId;

    @Column(name = "mapname" )
    private String MapName;

    @Column(name = "isroad")
    private Integer IsRoad;

    @Column(name = "mapaddress")
    private String Address;

    public String getMapId() {
        return MapId;
    }

    public void setMapId(String mapId) {
        MapId = mapId;
    }

    public String getMapName() {
        return MapName;
    }

    public void setMapName(String mapName) {
        MapName = mapName;
    }

    public int getIsRoad() {
        return IsRoad;
    }

    public void setIsRoad(int isRoad) {
        IsRoad = isRoad;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
