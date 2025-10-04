
class Box {
    int value;
    Box(int v) { value = v; }
}

public class PassByDemo {

    static void changePrimitive(int x) {
        x = 100;
    }

    static void changeObject(Box b) {
        b.value = 100;
    }

    public static void main(String[] args) {
        int num = 50;
        Box box = new Box(50);

        changePrimitive(num);
        changeObject(box);

        System.out.println("num = " + num);             // يظل 50
        System.out.println("box.value = " + box.value); // تصبح 100
    }
}
