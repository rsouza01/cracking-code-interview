package cci.chapter1;

public class MatrixRotation {


    public static void main(String[] args) {

        MatrixRotation sc = new MatrixRotation();
        sc.run();
    }

    private void run() {

        int[][] matrix = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
        };

        System.out.println("cci.chapter1.MatrixRotation :'" + rotate(matrix) + "'.");

    }

    boolean rotate(int[][] matrix) {

        return true;
    }
}