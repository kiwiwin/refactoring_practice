public class Person {
    private String name;
    private String areaCode;
    private String officeNumber;

    public Person(String name, String areaCode, String officeNumber) {
        this.name = name;
        this.areaCode = areaCode;
        this.officeNumber = officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return areaCode + "_" + officeNumber;
    }
}
