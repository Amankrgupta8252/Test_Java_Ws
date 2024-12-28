public class java_Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        // 2D Array
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // Print 2D Array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] arr3D = new int[2][3][2];
        arr3D[0][0][0] = 1;
        arr3D[0][0][1] = 2;
        arr3D[0][1][0] = 3;
        arr3D[0][1][1] = 4;
        arr3D[0][2][0] = 5;
        arr3D[0][2][1] = 6;
        arr3D[1][0][0] = 7;
        arr3D[1][0][1] = 8;
        arr3D[1][1][0] = 9;
        arr3D[1][1][1] = 10;
        arr3D[1][2][0] = 11;
        arr3D[1][2][1] = 12;

        // Print 3D Array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr3D[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
