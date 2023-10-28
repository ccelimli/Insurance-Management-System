package entities.concretes;

import java.util.List;

public class IndividualUser extends User{
    public IndividualUser() {
    }

    public IndividualUser(String name, String surname, String email, String password, String job, int age) {
        super(name, surname, email, password, job, age);
    }
}
