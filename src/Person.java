public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public Person(String name, String areaCode, String officeNumber) {
        this.name = name;
        this.telephoneNumber = new TelephoneNumber(areaCode, officeNumber);
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return getAreaCode() + "_" + getOfficeNumber();
    }

    public String getAreaCode() {
        return telephoneNumber.getAreaCode();
    }

    public String getOfficeNumber() {
        return telephoneNumber.getOfficeNumber();
    }
}

class TelephoneNumber {
    private String areaCode;
    private String officeNumber;

    public TelephoneNumber(String areaCode, String officeNumber) {
        this.areaCode = areaCode;
        this.officeNumber = officeNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
}