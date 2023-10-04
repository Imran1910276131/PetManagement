public abstract class Pet {
        private String name;
        private String ownerName;
        public Pet(String name,String ownerName)
        {
            this.name=name;
            this.ownerName=ownerName;
        }
        public String getName()
        {
            return name;
        }
        public String getOwnerName()
        {
            return ownerName;
        }
        public abstract void makeASound();
}
