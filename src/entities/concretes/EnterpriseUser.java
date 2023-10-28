package entities.concretes;

public class EnterpriseUser extends User{
    private String companyName;


    public EnterpriseUser(String name, String surname, String email, String password, String job, int age, String companyName) {
        super(name, surname, email, password, job, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
