package Training;

public class Library {
   String name;
   String place;
   Department[] departments;

   public Library(String name, String place, Department[] departments) {
      this.name = name;
      this.place = place;
      this.departments = departments;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPlace() {
      return place;
   }

   public void setPlace(String place) {
      this.place = place;
   }

   public Department[] getDepartments() {
      return departments;
   }

   public void setDepartments(Department[] departments) {
      this.departments = departments;
   }
}
