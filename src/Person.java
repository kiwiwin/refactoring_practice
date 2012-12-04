public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;
    
    public Person(String name, String areaCode, String officeNumber, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.telephoneNumber = new TelephoneNumber(areaCode, officeNumber);
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}