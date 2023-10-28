package entities.concretes;

import entities.abstracts.Insurance;

import java.time.LocalDate;

public class TravelInsurance extends Insurance {
    public TravelInsurance(int id, String name, double price, LocalDate startDate, LocalDate endDate) {
        super(id, name, price, startDate, endDate);
    }
}
