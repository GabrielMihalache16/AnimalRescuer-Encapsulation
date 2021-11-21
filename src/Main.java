public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Animal();
        dog1.setName("Azorel");
        dog1.setAge((byte)15);
        dog1.setHealthLevel((byte)5);
        dog1.getHealthLevel();
        dog1.setHungerLevel((byte)6);
        dog1.getHungerLevel();
        dog1.setSpiritLevel((byte)10);
        dog1.setFavouriteFood("pate");
        dog1.getFavouriteFood();
        dog1.setFavouriteRecreationActivity("plimbare");
        dog1.animalPrint();

        Adopter adp1 = new Adopter();
        adp1.setName("Veronica");
        System.out.println(adp1.getName());
        adp1.setAvailableMoney((double)100);
        adp1.adopterPrint();

        AnimalFood af1 = new AnimalFood();
        af1.setName("Pate");
        af1.getName();
        af1.setPrice((double)150);
        af1.getPrice();
        af1.setQuantity(10);
        af1.getQuantity();
        af1.setAvailable(true);
        af1.foodPrint();

        RecreationActivity rac1 = new RecreationActivity();
        rac1.setName("Plimbare");
        rac1.getName();
        rac1.printRecreationActivity();

        Veterinarian vet1 = new Veterinarian();
        vet1.setName("Gigel");
        vet1.getName();
        vet1.setSpecialization("Caini");
        vet1.getSpecialization();
        vet1.vetPrint();




    }
}
