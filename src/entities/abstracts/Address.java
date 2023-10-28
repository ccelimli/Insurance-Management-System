package entities.abstracts;

public abstract class Address {

    private int doorNumber;
    private int floorNo;
    private String buildingNo;
    private String streetName;
    private String countyName;
    private String cityName;

    public Address() {
    }

    public Address(int doorNumber, int floorNo, String buildingNo, String streetName, String countyName, String cityName) {
        this.doorNumber = doorNumber;
        this.floorNo = floorNo;
        this.buildingNo = buildingNo;
        this.streetName = streetName;
        this.countyName = countyName;
        this.cityName = cityName;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
