public class Q17 {
    public class Flower {
        private String name;
        private int numberOfPetals;
        private float price;

        public Flower(String name, int numberOfPetals, float price) {
            this.name = name;
            this.numberOfPetals = numberOfPetals;
            this.price = price;
        }


        public String getName() {
            return name;
        }
        public int getNumberOfPetals() {
            return numberOfPetals;
        }

        public float getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumberOfPetals(int numberOfPetals) {
            this.numberOfPetals = numberOfPetals;
        }

        public void setPrice(float price) {
            this.price = price;
        }
    }
}
