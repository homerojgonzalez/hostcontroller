/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataObjects;

/**
 * This class stores info on the position of the winch
 *
 * @author dbennett3, Noah Fujioka
 */
public class WinchPosition {
    int id;
    int runwayParentId;
    String name;
    float altitude;
    float latitude;
    float longitude;
    String optionalInfo;
    
    public WinchPosition(String name, float altitude, float latitude, float longitude, String optional) {
        this.name = name;
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
        this.optionalInfo = optional;
    }
    
    public WinchPosition(int id, int pid, String name, float altitude, 
            float latitude, float longitude, String optional){
        this.id = id;
        this.runwayParentId = pid;
        this.name = name;
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
        return name;
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
        return name;
    }
}
