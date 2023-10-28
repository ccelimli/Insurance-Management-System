package entities.concretes;

import entities.abstracts.Insurance;

import java.time.LocalDate;

public class CarInsurance extends Insurance {
    public CarInsurance(int id, String name, double price, LocalDate startDate, LocalDate endDate) {
        super(id, name, price, startDate, endDate);
    }
}
