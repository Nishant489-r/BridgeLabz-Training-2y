package FunctionalInterface;
class Prototype implements Cloneable {
    int value;

    public Prototype(int value) { this.value = value; }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloningDemo {
    public static void main(String[] args) throws Exception {
        Prototype p1 = new Prototype(10);
        Prototype p2 = (Prototype) p1.clone();

        System.out.println("Original: " + p1.value);
        System.out.println("Clone: " + p2.value);
    }
}
