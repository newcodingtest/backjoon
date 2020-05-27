import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();


        char matrix[][] = new char[N][N];
        matrix = fx(N);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    static char[][] fx(int N) { // num=27

        int N3 = N / 3; //9
        char[][] fmatrix = new char[N][N]; // 27X27


        if (N > 3) {
            char[][] bmatrix = new char[N3][N3]; //9X9
            bmatrix = fx(N3); // num =9

            for (int i = 0; i < N3; i++) {
                for (int j = 0; j < N3; j++) {
                    fmatrix[i][j] = bmatrix[i][j];
                    fmatrix[i + N3][j] = bmatrix[i][j];
                    fmatrix[i + 2 * N3][j] = bmatrix[i][j];

                    fmatrix[i][j + N3] = bmatrix[i][j];
                    fmatrix[i + N3][j + N3] = ' ';
                    fmatrix[i + 2 * N3][j + N3] = bmatrix[i][j];

                    fmatrix[i][j + 2 * N3] = bmatrix[i][j];
                    fmatrix[i + N3][j + 2 * N3] = bmatrix[i][j];
                    fmatrix[i + 2 * N3][j + 2 * N3] = bmatrix[i][j];
                }
            }//if문
        } else if (N == 3) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    fmatrix[i][j] = '*';
                }
            }
            fmatrix[1][1] = ' ';
        }//else if문
        return fmatrix;
    }
}