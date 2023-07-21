package JAVA;
import java.util.*;
public class twoDArray {
    public static void main(Strings[] args){
        //type arrayName[][] = new int[rows][columns]
       /*Scanner sc = new Scanner(System.in);
       System.out.println("The the number of rows:");
       int rows = sc.nextInt();
       System.out.println("Enter the number of columns:");
       int cols = sc.nextInt();

       int arr[][] = new int [rows][cols];
       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               arr[i][j] = sc.nextInt();
           }
       }
        System.out.println("Your array is:");
       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }*/



//----------------------------------------------------------------------------------------------------------------------



        //taking 2Darray as an input and finding the x input by the user.
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols:");
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //input value of x
        System.out.println("Enter the value of x: ");
        int x= sc.nextInt();
        //searching x
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]==x){
                    System.out.println("X found at: " + i +"," + j );
                }
            }
        }*/



//----------------------------------------------------------------------------------------------------------------------




        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc. nextInt();
        int arr[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<cols; j++){
            for(int i=0; i<rows; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }







    }
}
