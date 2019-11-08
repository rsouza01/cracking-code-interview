package cci.chapter1;

public class MatrixRotation {


    public static void main(String[] args) {

        MatrixRotation sc = new MatrixRotation();
        sc.run();
    }

    private void run() {

        int[][] matrix = {
                { 1,  2,  3,  5},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        System.out.println("cci.chapter1.MatrixRotation :'" + rotate(matrix) + "'.");

    }

    boolean rotate(int[][] matrix) {

        int N = matrix.length;

        System.out.println(N);
        int[] temp = new int[N];

        for(int layer = 0; layer < N; layer++) {




        }


        return true;
    }
}