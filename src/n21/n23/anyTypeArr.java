package n21.n23;

public class anyTypeArr {
    private static Object[] arr;
    public static <T> void printArr(T[] arr) {
        for (T t : arr) {
            System.out.print(t+" ");
        }
        System.out.println();
    }

    //get arr element
    public static <T> T getArrElement(T[] arr, int i) {
        return (T) arr[i];
    }

    public static void main(String[] args) {
        arr = new Object[]{1, 2, 3, 4, 5};
        printArr(arr);
        arr = new Object[]{"Hello", "World"};
        printArr(arr);
        arr = new Object[]{1.23445, 2342.324, 3234324.2332443, 4, 5};
        printArr(arr);
        System.out.println(getArrElement(arr, 2));
    }
}
