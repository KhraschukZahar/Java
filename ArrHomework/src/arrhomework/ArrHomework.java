/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrhomework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class ArrHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       BufferedReader buffered = new BufferedReader (new InputStreamReader(System.in));
       
///////////////////////////////////       FIST TASK      //////////////////////////////////////////////
//      int arr[] = new int[15];
//        int min = 50, max = 1;
//        int minInd = 0, maxInd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 50 + 1 );
//            System.out.print(arr[i] + "  ");
//        }
//        System.out.println();
//    
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//                minInd = i;
//            }
//            if(arr[i]>max)
//            {
//                max = arr[i];
//                maxInd = i;
//            }
//        }
//        System.out.println("Min: " + min + "\nMax: " + max);
//        for (int i = 0; i < arr.length; i++) {
//            if(i==minInd)
//            arr[i] = min;
//            if(i==maxInd)
//            arr[i] = max;
//            System.out.print(arr[i] + "  ");
//        }

///////////////////////////////////       SECCOND TASK      //////////////////////////////////////////////

//int arr[] = new int[15];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 10 + 1 );
//            System.out.print(arr[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2!=0)
//                sum+=arr[i];
//        }
//        System.out.println("Sum of digits: " + sum);

///////////////////////////////////       THIRD TASK      //////////////////////////////////////////////

// int rows = 10;
//        int[] arr1 = new int[rows];
//        int[] arr2 = new int[rows];
//        System.out.println("Arr A: ");
//        for (int i = 0; i < rows; i++) {
//            arr1[i] = (int)(Math.random() * 9 + 1 );    
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Arr B: ");
//        for (int i = 0; i < rows; i++) {
//            arr2[i] = (int)(Math.random() * 9 + 1 );        
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//        int[] arr3 =  new int[rows*2];
//        int count = 0;
//        for (int i = 0; i < arr3.length; i++) {
//            if(i<10)
//            {
//                arr3[i]=arr1[count];
//                count++;
//            }else{
//                if(count>9){
//                    count=0;
//                }
//                arr3[i]=arr2[count];
//                count++;
//            }
//        }
//        System.out.println("Arr C: ");
//        for (int i = 0; i < arr3.length; i++) {        
//            System.out.print(arr3[i] + " ");
//        }
    }
}
