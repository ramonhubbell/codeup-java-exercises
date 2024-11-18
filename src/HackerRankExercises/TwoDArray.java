package HackerRankExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class TwoDArray {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of rows and columns:");
//        int rows = scanner.nextInt();
//        int columns = scanner.nextInt();
//
//        int [][] array = new int[rows][columns];
//        System.out.println("Enter the elements of the 2D array:");
//        for (int i = 0; i < rows; i++){
//            for (int j = 0; j < columns; j++){
//                array [i][j] = scanner.nextInt();
//            }
//        }
//        scanner.close();

//        int maxValue = 0;
//        for (int i = 0; i <= 3; i++) {
//
//            for (int j = 0; j <= 3; j++) {
//                int sum = array[i][j] + array[i][j+1] + array[i][j+2] +
//                           array[i+1][j+1] +
//                           array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
//            System.out.println("Hourglass sum at (" + i + "," + j + "): " + sum);
//                if(sum > maxValue){
//                    maxValue = sum;
//                }
//            }
//
//        }
//        System.out.println("maxValue: " + maxValue);




//        int a[][] = new int[6][6];
//        int maxSum = Integer.MIN_VALUE;
//        try (Scanner scanner = new Scanner(System.in);) {
//            for(int i = 0; i < 6; i++) {
//                for(int j = 0; j < 6; j++) {
//                    a[i][j] = scanner.nextInt();
//                    if (i > 1 && j > 1) {
//                        int sum =
//                                a[i][j]
//                                        + a[i][j-1]
//                                        + a[i][j-2]
//                                        + a[i-1][j-1]
//                                        + a[i-2][j]
//                                        + a[i-2][j-1]
//                                        + a[i-2][j-2];
//                        if (sum > maxSum) {maxSum = sum;}
//                    }
//                }
//            }
//        }
//        System.out.println(maxSum);

//        int arr [][] = new int[6][2];
//        int maxSum =  Integer.MIN_VALUE;
//        try(Scanner scanner = new Scanner(System.in)){
//
//        }

//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        List<List<Integer>> arr = new ArrayList<>();
//
//        IntStream.range(0, 6).forEach(i -> {
//            try {
//                arr.add(
//                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                                .map(Integer::parseInt)
//                                .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        bufferedReader.close();
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1,2));
        arr.add(Arrays.asList(3,4));
        System.out.println("arr: " + arr);
        //ToDO hard code a 6 x 6 2d array.
        for (List<Integer> row :  arr){
            System.out.println("arr in first loop, arr.get(0): " + arr.get(0));
            System.out.println("arr in first loop, arr.get(1): " + arr.get(1));
            for (Integer number : row ){
                System.out.println("row: " + row);
                System.out.println("number: " + number);
            }
//            System.out.println();
        }

        //Brief explanation: In the constraints it say's that the max number inside the array it would be -9 and 9,
//        so that means the minus possible value it could be -9, because if you do the sum of -9, you would get -63.
//        From there, is just to know how to access to the position of the hourglass in the array. So each a,b,c are
//        que first top, the middle and bottom of the hourglass, then summed. And the array should only go to <=3,
//        since if not it would go index out of bound when your'e trying to access the values in the array.

//        int max_value = -63;
//
//        for(int i = 0; i<=2; i++){
//            for(int j=0; j<=2; j++){

//                a b c
//                  d
//                e f g
//                System.out.println("i: " + arr.get(i));
//                System.out.println("j: " + arr.get(j));
//                System.out.println("Top row, i and j: " + arr.get(i).get(j));
//                System.out.println("Top row, i and j+1: " + arr.get(i).get(j+1));
//                System.out.println("Top row, i and j+2: " + arr.get(i).get(j+2));
//                int a = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
//                System.out.println("int a: " + a);
//                int b = arr.get(i+1).get(j+1);
//                System.out.println("int b: " + b);
//                int c = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
//                int current_sum = a+b+c;
//
//                if(max_value<current_sum){
//                    max_value = current_sum;
//                }
//            }
//        }

//        System.out.println(max_value);

    }

}
