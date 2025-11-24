package Generic;
import java.util.ArrayList;
import java.util.List;
class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}  

class FruitBox<T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void display() {
        for (T f : fruits) System.out.println(f.getClass().getSimpleName());
    }
}

public class TestFruit {
    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>();
        box.add(new Apple());
        box.add(new Apple());
        box.display();
    }
}
