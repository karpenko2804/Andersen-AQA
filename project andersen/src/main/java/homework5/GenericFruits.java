package homework5;

import java.util.ArrayList;

public class GenericFruits {
    public void main(String[] args){
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();

        boxApple.addFruit(apple);
        boxOrange.addFruit(orange);



    }
}
class Fruit {
    float weigth;
    float number;
}

class Apple extends Fruit {
    public Apple() {
        super.weigth = 1.0f;
        super.number = 0;
    }
}
class Orange extends Fruit{
    public Orange() {
        super.weigth = 1.5f;
        super.number = 0;
    }
}
class Box<T>{
    ArrayList<T> arrayList;
    private boolean empty = true;
    float maxWeight = 100.0f;
    float currentWeight = 0;

    float getWeight(Fruit f) {
        return arrayList.size() * f.weigth;
    }
    boolean compare(Fruit a, Fruit b) {
        if (getWeight(a) == getWeight(b)) {
            return true;
        } else return false;
    }

    public boolean takeFruitsFromCurrentBoxIntoAnother(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }
    void addFruit(Fruit fruit) {
        if (currentWeight + 1 <= maxWeight|arrayList.size() < 1) {
            currentWeight++;
                empty = false;
        } else
            System.out.println("The fruits are added into the box");
    }
}


