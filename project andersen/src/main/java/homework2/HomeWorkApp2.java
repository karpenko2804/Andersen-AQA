package homework2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        within10And20(10, 20);
        positiveNumberOrNegative(10);
        positiveOrNegative(10);
        printWord5Times("word", 5);
        defineIfYearIsLeapOrNot(400);
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        lenAndInitialValue(2, 2);
        minAndMaxNumber();


    }

    public static boolean within10And20(int x1, int x2) {
        if (x1 + x2 >= 10 && x1 + x2 <= 20) {
            return true;
        } else {
            return false;

        }
    }

    public static void positiveNumberOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean positiveOrNegative(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWord5Times(String word, int x) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(word);
        }

    }

    public static boolean defineIfYearIsLeapOrNot(int x) {
        if (x % 100 == 0 && x % 400 == 0) {
            return true;
        } else if (x % 4 == 0 && x % 100 > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.println(i);
            } else {
                arr[i] = 0;
            }
            System.out.println(i);
        }
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(i);
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            arr[i][i] = 1;
            arr[i][4 - 1 - i] = 1;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println("");
        }
    }


    public static int[] lenAndInitialValue(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void minAndMaxNumber() {
        int numbers[] = {10, 20, 30, 40, 50, 60};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < 1; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
            System.out.println("min is: " + min + "; max is: " + max);

        }
    }



}










