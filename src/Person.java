public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public Person(String name, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}