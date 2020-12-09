package bai_6_Abstract_Class_Interface.thuc_hanh;

public  class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return  "could be fried";
    }
}
