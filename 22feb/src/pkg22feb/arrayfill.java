/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22feb;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ahmed
 */
public class arrayfill {
        public static void main(String[] args) {
          /*  Scanner scanner = new Scanner(System.in);
            System.out.println("enter array size (between 1 and 10)");
            int n = scanner.nextInt();
         int arr[] = new int[n];
         for (int i=0;i<arr.length;i++){
             int m = scanner.nextInt();
             arr[i]=m;
         }*/
         //2D
         int [][]arr = {{2,1,4,6},{9,3,8,7}};
        // Arrays.sort(arr);
getmax2D(arr);
int []ar = {2,5,6,32,22,11};
//getmax(ar);
getmaxcol2D(arr);
sum(arr);
sumcol(arr);
        }
        
        public static void getmax2D(int[][]num){
            for(int i=0;i<num.length;i++){
                int maxvalue=num[i][0];
            for(int j=1;j<num[i].length;j++){
                if(maxvalue<num[i][j]){
                    maxvalue=num[i][j];
                }
            }
                     System.out.println("max is at row: "+(i+1)+" value is: "+maxvalue);

            }
        }
          public static void getmaxcol2D(int[][]num){
            for(int j=0;j<num[0].length;j++){
                int maxvalue=num[0][j];
            for(int i=1;i<num.length;i++){
                if(maxvalue<num[i][j]){
                    maxvalue=num[i][j];
                }
            }
                     System.out.println("max is at col: "+(j+1)+" value is: "+maxvalue);

            }
        }
        public static void getmax(int[]num){
            int flag=0;
            int max = 0;
            for(int i=0;i<num.length;i++){
                if (num[i]>flag){
                    max = num[i];
                    flag = num[i];
                }
            }
                            System.out.println(max);

        }
        public static void sum(int[][]num){
            for(int i=0;i<num.length;i++){
                int sub=num[i][0];
                for(int j=1;j<num[i].length;j++){
                    sub+=num[i][j];
                    
                }
            System.out.println("sum of row "+(i+1)+" is : "+sub);
            }
            
        }
        public static void sumcol(int [][]num){
            for(int j=0;j<num[0].length;j++){
                int sub = num[0][j];
                for(int i=1;i<num.length;i++){
                    sub+=num[i][j];
                }
                            System.out.println("sum of col "+(j+1)+" is : "+sub);

            }
        }
}
