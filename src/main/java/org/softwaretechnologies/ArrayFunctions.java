package org.softwaretechnologies;

public final class ArrayFunctions {

    private ArrayFunctions() {
    }

    /**
     * Функция, меняющая порядок элементов в массиве array на обратный.
     * @param array массив, который будет перевернут.
     */
    public static void reverse(int[] array) {
        // TODO: реализуйте вышеуказанную функцию
        int length = array.length;
        for(int i = 0; i < length/2; i++){
            int temp = array[i];
            array[i] = array[length-i-1];
            array[length-i-1] = temp;
        }
    }

    /**
     * Функция, заменяющая строки матрицы на столбцы матрицы. Пример:
       1  2  3     1  4  7
       4  5  6     2  5  8
       7  8  9     3  6  9
     * Функция работает только с квадратными матрицами.
     * Если матрица не квадратная, то выведете на экран сообщение:
       Матрица не квадратная
     * @param matrix матрица, в которой столбцы будут заменены на строки.
     */
    public static void rotateMatrix(int[][] matrix) {
        // TODO: реализуйте вышеуказанную функцию
        if(matrix.length == 0)
            return;

        int x = matrix.length;
        int y = matrix[0].length;

        if(x!=y)
        {
            System.out.println("Матрица не квадратная");
            return;
        }

        int[][] a = new int[x][y];
        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                a[i][j] = matrix[j][i];
            }
        }

        for(int i = 0; i < x; i++)
            for(int j = 0; j < y; j++) {
                matrix[i][j] = a[i][j];
            }
    }
}
