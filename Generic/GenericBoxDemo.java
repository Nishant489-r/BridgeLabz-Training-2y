package Generic;
class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        System.out.println("Integer Box: " + intBox.get());
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, Generics!");
        System.out.println("String Box: " + stringBox.get());
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14159);
        System.out.println("Double Box: " + doubleBox.get());
    }
}