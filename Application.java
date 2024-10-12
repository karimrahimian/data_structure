import monj.ArrayOperation;

public class Application {
    public static void main(String[] args) {
        ArrayOperation arrayOperation = new ArrayOperation();
        arrayOperation.insertEnd(15);
        arrayOperation.insertEnd(16);
        arrayOperation.insertEnd(17);
        arrayOperation.insertAt(20,0);
        arrayOperation.traverse();
        System.out.println("\n");
        arrayOperation.deleteAt(1);
        arrayOperation.insertEnd(22);
        arrayOperation.traverse();
    }
}
