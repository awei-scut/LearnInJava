package pattern;

public class Computer {
    private String name;
    private String price;

    private Computer(Builder builder){
        this.name = builder.name;
        this.price = builder.price;
    }

     static class Builder{
        String name;
        String price;

        public Builder(){}

        public Builder setPrice(String price){
            this.price = price;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer.Builder().setName("a").build();
    }
}
