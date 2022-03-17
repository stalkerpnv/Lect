import java.util.Arrays;
public class MainLoops {
    public static void main(String[] args) {
        // pointer = value; condition; condition of change pointer
        // type [] name
        int [] arr; // Объявление
        arr = new int[5]; // Инициализация массива
        // 0 1 2 3 4
        // size - 1
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int [] arrTwo = {1,2,3,4,5};

        int [] arrThree = new int[5];
        int k = 1;
        for (int i = 0; i < arrThree.length; i++) {
            arrThree[i] = k++;
        }
        System.out.println(Arrays.toString(arrThree));

        int [][] arrTwoD = new int[4][5];
        for (int i = 0; i < arrTwoD.length; i++) { // 4
            for (int j = 0; j < arrTwoD[i].length; j++) { // 5
                arrTwoD[i][j]= i+j;
            }
        }
        for (int i = 0; i < arrTwoD.length; i++) { // 4
            for (int j = 0; j < arrTwoD[i].length; j++) { // 5
                System.out.print(arrTwoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arrTwoD));
    }
}
