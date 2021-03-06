/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataObjects;

/**
 * This Class stores the data about a Position
 * 
 * @author garreola-gutierrez, mtdargen, dbennett3, Noah Fujioka
 */
public class GliderPosition {
    
    int id;
    int runwayParentId;
    String positionName;
    float altitude;
    float latitude;
    float longitude;
    String optionalInfo;
    
    public GliderPosition(String name, float altitude, float latitude, float longitude, String optional){
       this.positionName = name;
       this.altitude = altitude;
       this.latitude = latitude;
       this.longitude = longitude;
       this.optionalInfo = optional;
    }
    
    public GliderPosition(int id, int pid, String name, float altitude, 
            float latitude, float longitude, String optional){
        this.id = id;
        this.runwayParentId = pid;
        this.positionName = name;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.optionalInfo = optional;
    }
    public int getId(){
        return id;
    }
    
    public void setId(int newId){
        id = newId;
    }
    public String getName() {
        return positionName;
    }
    
    public int getRunwayParentId(){
        return runwayParentId;
    }
    
    public void setRunwayParentId(int newRunwayParentId){
        runwayParentId = newRunwayParentId;
    } 
    
    public float getElevation() {
        return altitude;
    }
    
    public float getLatitude() {
        return latitude;
    }
    
    public float getLongitude() {
        return longitude;
    }
    
    public String getOptionalInfo() {
        return optionalInfo;
    }

    public String toString() {
        return positionName;
    }
}

    
