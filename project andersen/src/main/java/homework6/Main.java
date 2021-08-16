package homework6;

public class Main {
    public static void main(String[][]args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"2", "2", "2", "3"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Wrong data in:" + e);
            }
        } catch (MyArrayDataException e) {
            System.out.println();
            System.out.println();
        }
    }

    public static int method(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        int value = 0;
        int[] arrInt = new int[4];

        if (arr.length > 4) {
            throw new MyArraySizeException("Wrong array size!");
        }
        for (int i = 0; i < arr.length; i++) {
            arrInt[i] = Integer.parseInt(String.valueOf(arr[i]));
            sum += arr.length;
        }
        return sum;
    }
}










