public class Cat extends Pet {
    public Cat(String Name,String ownerName){
        super(Name, ownerName);
    }
    @Override
    public void makeASound() {
       System.out.println("Meowing");
    }
}
