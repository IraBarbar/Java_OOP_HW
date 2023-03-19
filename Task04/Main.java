
public class Main {
    public static void main(String[] args) {

        LL<Integer> listInteger = new LL<>();
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(-80);
        
        listInteger.printArr();
        listInteger.bubbleSort();
        listInteger.printArr();
        listInteger.printMax();
        listInteger.printMin();
        listInteger.printSum();
        listInteger.printProduct();
        listInteger.printIndex(20);
        listInteger.printContains(10);
        listInteger.remove(10);
        listInteger.selectionSort();
        listInteger.printArr();


        System.out.println();
        LL<String> listString = new LL<>();

        listString.add("baack");
        listString.add("panda");
        listString.add("panda");
        listString.add("interface");
        listString.add("no");

        listString.printArr();
        listString.printMax();
        listString.printMin();
        listString.printSum();
        listString.printProduct();
        listString.printIndex("no");
        listString.printContains("no");
        listString.insertionSort();
        listString.printArr();
        listString.removeAll("panda");
        listString.printArr();

        System.out.println();
        Double[] arr = { 10.30, 20.84, -20.22 };
        LL<Double> listDouble = new LL<>(arr);

        listDouble.printArr();
        listDouble.printMax();
        listDouble.printMin();
        listDouble.printSum();
        listDouble.printProduct();
        listDouble.printIndex(-21.51);
        listDouble.printContains(10.30);
        listDouble.bubbleSort();
        listDouble.printArr();

        Float[] arr02 = { 10.2f, 20f, -2.3333f };
        LL<Float> intList = new LL<>(arr02);
        intList.printArr();
        intList.bubbleSort();
        intList.printArr();

    }
}
