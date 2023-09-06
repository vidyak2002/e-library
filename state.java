package Training;

import java.math.BigDecimal;

public class state {
    String stateName;
    String population;
    District[] districts;

    public state(String stateName, String population, District[] districts) {
        this.stateName = stateName;
        this.population = population;
        this.districts = districts;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }
}
