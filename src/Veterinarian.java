public class Veterinarian {
    private String name;
    private String specialization;
    public void vetPrint(){
        System.out.println("Name: " +name + "\nSpecialization: " + specialization);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}

