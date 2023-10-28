package entities.concretes;

import entities.abstracts.Insurance;

import java.time.LocalDate;

public class HealthInsurance extends Insurance {
    public HealthInsurance(int id, String name, double price, LocalDate startDate, LocalDate endDate) {
        super(id, name, price, startDate, endDate);
    }
}
