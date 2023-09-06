package Training;

public class Village {
    String name;
    String pinCode;
    String noOfFamilies;

    public Village(String name, String pinCode, String noOfFamilies) {
        this.name = name;
        this.pinCode = pinCode;
        this.noOfFamilies = noOfFamilies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getNoOfFamilies() {
        return noOfFamilies;
    }

    public void setNoOfFamilies(String noOfFamilies) {
        this.noOfFamilies = noOfFamilies;
    }
}
