public class Dog extends Pet {
    public Dog(String Name,String ownerName){
        super(Name, ownerName);
    }
    @Override
    public void makeASound() {
       System.out.println("Barking");
    }
    
}
