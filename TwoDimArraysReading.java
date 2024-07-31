import java.util.Scanner;

public class TwoDimArraysReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, C;
        R = sc.nextInt(); // reading rows
        C = sc.nextInt(); // reading columns
        // Create a 2-D array of R rows C columns
        int[][] arr = new int[R][C];

        // arr[i][j] = arr[0][0], arr[1][1]
        // reading 2-D array
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j] * arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}