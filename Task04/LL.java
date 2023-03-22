
import java.util.Iterator;
import java.util.LinkedList;

public class LL<T extends Comparable<T>> implements Iterable<T> {

    private LinkedList<T> arr;
    private int index;
    private int size;

    public LL() {
        arr = new LinkedList<>();
        index = 0;
        size = 0;
    }

    public LL(T[] inputArr) {
        arr = new LinkedList<>();
        size = inputArr.length;
        for (T element : inputArr) {
            arr.add(element);
        }
        index = 0;
    }

    // Оператор, получающий элемент по заданному индексу:
    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("The index is invalid!");
            return null;
        }
        return arr.get(index);
    }

    // Сортировка простым выбором:
    public void selectionSort() {
        if (size < 2) {
            // Если список пустой или содержит только один элемент, то он уже отсортирован
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr.get(j).compareTo(arr.get(maxIndex)) > 0) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                T temp = arr.get(i);
                arr.set(i, arr.get(maxIndex));
                arr.set(maxIndex, temp);
            }
        }
    }

    public void bubbleSort() {
        if (size < 2) {
            // Если список пустой или содержит только один элемент, то он уже отсортирован
            return;
        }

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < size - 1; i++) {
                T current = arr.get(i);
                T next = arr.get(i + 1);
                if (current.compareTo(next) > 0) {
                    // Меняем местами элементы списка
                    arr.set(i, next);
                    arr.set(i + 1, current);
                    swapped = true;
                }
            }
        }
    }

    // Сортировка простыми вставками:
    public void insertionSort() {
        if (size < 2) {
            // Если список пустой или содержит только один элемент, то он уже отсортирован
            return;
        }
        for (int i = 1; i < size; i++) {
            T current = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j).compareTo(current) > 0) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, current);
        }
    }

    /**
     * Проверка наличия элемента в массиве. Возвращает true,
     * если элемент в массиве есть, false - нет.
     */
    public boolean contains(T value) {
        return arr.contains(value);
    }

    public void printContains(T value) {
        System.out.println("The element  is in the list " + contains(value));
    }

    public int findIndex(T element) {
        int index = 0;
        for (T item : arr) {
            if (item.compareTo(element) == 0) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public void printIndex(T element) {
        System.out.println("The index " + element + " = " + findIndex(element));
    }

    public T product() {
        T product = null;
        try {
            for (T element : arr) {
                if (element instanceof Number) {
                    if (product == null) {
                        product = (T) (Number) 1;
                    }
                    product = (T) (Number) (((Number) element).doubleValue() * ((Number) product).doubleValue());
                } else {
                    throw new ClassCastException("Element cannot be cast to Number.");
                }
            }
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
            product = null;
        }
        return product;
    }

    public void printProduct() {
        System.out.println("Product of elements = " + product());
    }

    public double sum() {
        double sum = 0;
        try {

            for (T element : arr) {
                if (element instanceof Number) {
                    sum += ((Number) element).doubleValue();
                } else if (element instanceof String) {
                    sum += ((String) element).length();
                } else {
                    throw new ClassCastException("Unsupported type: "
                            + element.getClass().getName());
                }
            }
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
            sum = 0;
        }

        return sum;
    }

    public void printSum() {
        System.out.println("Sum of elements = " + sum());
    }

    public T findMin() {
        T min = arr.getFirst();
        for (T element : arr) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public void printMin() {
        System.out.println("The minimum element = " + findMin());
    }

    public T findMax() {
        T max = arr.getFirst();
        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public void printMax() {
        System.out.println("The maximum element = " + findMax());
    }

    public LinkedList<T> getArr() {
        return arr;
    }

    public void setArr(LinkedList<T> arr) {
        this.arr = arr;
    }

    public void add(T element) {
        arr.add(element);
        size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("The index is invalid!");
            return null;
        }
        T removedElement = arr.remove(index);
        size--;
        return removedElement;
    }

    @Override
    public Iterator<T> iterator() {

        Iterator<T> it = new Iterator<T>() {

            @Override
            public boolean hasNext() {
                return index < arr.size();
            }

            @Override
            public T next() {
                return arr.get(index++);
            }

        };
        return it;
    }

    public void removeAll(T element) {
        while (arr.contains(element)) {
            arr.remove(element);
            size--;
        }
    }

    public void printArr() {
        System.out.println(arr.toString());
    }

    public int size() {
        return arr.size();
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    // Задание значения элементу массива с заданным индексом:
    public T set(int index, T obj) {
        if (index < 0 || index >= size) {
            System.out.println("The index is invalid!");
            return null;
        }
        return arr.set(index, obj);
    }

    public void clear() {
        arr.clear();
    }

    public int indexOf(T obj) {
        return arr.indexOf(obj);
    }

    public int lastIndexOf(T obj) {
        return arr.lastIndexOf(obj);
    }
}