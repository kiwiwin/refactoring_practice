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

    public String getTelephoneNumber() {
        return getAreaCode() + "_" + getOfficeNumber();
    }
}
