package Training;

public class District {
    String name;
    String popupation;
    Village[] villages;

    public District(String name, String popupation, Village[] villages) {
        this.name = name;
        this.popupation = popupation;
        this.villages = villages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopupation() {
        return popupation;
    }

    public void setPopupation(String popupation) {
        this.popupation = popupation;
    }

    public Village[] getVillages() {
        return villages;
    }

    public void setVillages(Village[] villages) {
        this.villages = villages;
    }
}
