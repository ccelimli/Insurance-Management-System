package entities.concretes;

import entities.abstracts.Address;

public class HomeAddress extends Address {

    public HomeAddress() {
    }

    public HomeAddress(int doorNumber, int floorNo, String buildingNo, String streetName, String countyName, String cityName) {
        super(doorNumber, floorNo, buildingNo, streetName, countyName, cityName);
    }
}
