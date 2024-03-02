/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22feb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author ahmed
 */
public class arrays {
            public static void main(String[] args) {
                int []arr={11,223,43,54,6,1212};
                Arrays.sort(arr);
                System.out.println("sorted array");
                                System.out.println(Arrays.toString(arr));
    String []names ={"ari","amadou","duboise"};
    Arrays.sort(names);
    System.out.println(Arrays.toString(names));
        
    ArrayList<String> fruits = new ArrayList();
    fruits.add("apple");
        fruits.add("orange");
    fruits.add("strawberry");
    fruits.add("kiwi");
    Collections.sort(fruits);
    System.out.println(fruits);
   

            }
}
