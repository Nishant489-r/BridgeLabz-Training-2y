package FunctionalInterface;
interface BackupSerializable {}

class UserData implements BackupSerializable {
    String name;
    int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class BackupSerializationDemo {
    public static void main(String[] args) {
        UserData data = new UserData("Amit", 25);

        if (data instanceof BackupSerializable)
            System.out.println("Object allowed for backup");
    }
}
