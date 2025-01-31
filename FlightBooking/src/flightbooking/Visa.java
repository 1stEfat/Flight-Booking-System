package flightbooking;
public class Visa {
    private String country;
    private String[] requirements;
    public Visa() {
    }
    public Visa(String country, String[] requirements) {
        this.country = country;
        this.requirements = requirements;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String[] getRequirements() {
        return requirements;
    }
    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }
}

