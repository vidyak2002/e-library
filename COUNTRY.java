package Training;

public class COUNTRY {
    String countryName;
    int id;
    state[] states;

    public COUNTRY(String countryName, int id, state[] states) {
        this.countryName = countryName;
        this.id = id;
        this.states = states;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public state[] getStates() {
        return states;
    }

    public void setStates(state[] states) {
        this.states = states;
    }
}
