public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog("Hans", "Daniel");
        Cat cat=new Cat("Bella","Lily");
        PetSystem petSystem=new PetSystem();
        petSystem.addPetToSystem(dog);
        petSystem.addPetToSystem(cat);
        petSystem.getPetSystemInformatin();
    }
}
