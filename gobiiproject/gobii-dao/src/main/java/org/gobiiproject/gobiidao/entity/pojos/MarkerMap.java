package org.gobiiproject.gobiidao.entity.pojos;
// Generated Mar 31, 2016 1:44:38 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MarkerMap generated by hbm2java
 */
@Entity
@Table(name="marker_map"
    ,schema="public"
)
public class MarkerMap  implements java.io.Serializable {


     private int markerMapId;
     private int markerId;
     private Integer mapId;
     private String linkage;
     private int position;
     private Integer fstart;
     private Integer fstop;

    public MarkerMap() {
    }

	
    public MarkerMap(int markerMapId, int markerId, String linkage, int position) {
        this.markerMapId = markerMapId;
        this.markerId = markerId;
        this.linkage = linkage;
        this.position = position;
    }
    public MarkerMap(int markerMapId, int markerId, Integer mapId, String linkage, int position, Integer fstart, Integer fstop) {
       this.markerMapId = markerMapId;
       this.markerId = markerId;
       this.mapId = mapId;
       this.linkage = linkage;
       this.position = position;
       this.fstart = fstart;
       this.fstop = fstop;
    }
   
     @Id 
    
    @Column(name="marker_map_id", unique=true, nullable=false)
    public int getMarkerMapId() {
        return this.markerMapId;
    }
    
    public void setMarkerMapId(int markerMapId) {
        this.markerMapId = markerMapId;
    }
    
    @Column(name="marker_id", nullable=false)
    public int getMarkerId() {
        return this.markerId;
    }
    
    public void setMarkerId(int markerId) {
        this.markerId = markerId;
    }
    
    @Column(name="map_id")
    public Integer getMapId() {
        return this.mapId;
    }
    
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }
    
    @Column(name="linkage", nullable=false)
    public String getLinkage() {
        return this.linkage;
    }
    
    public void setLinkage(String linkage) {
        this.linkage = linkage;
    }
    
    @Column(name="position", nullable=false)
    public int getPosition() {
        return this.position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
    
    @Column(name="fstart")
    public Integer getFstart() {
        return this.fstart;
    }
    
    public void setFstart(Integer fstart) {
        this.fstart = fstart;
    }
    
    @Column(name="fstop")
    public Integer getFstop() {
        return this.fstop;
    }
    
    public void setFstop(Integer fstop) {
        this.fstop = fstop;
    }




}


