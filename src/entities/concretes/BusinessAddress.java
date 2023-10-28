package entities.concretes;

import entities.abstracts.Address;

public class BusinessAddress extends Address {
    public BusinessAddress() {
    }

    public BusinessAddress(int doorNumber, int floorNo, String buildingNo, String streetName, String countyName, String cityName) {
        super(doorNumber, floorNo, buildingNo, streetName, countyName, cityName);
    }
}
