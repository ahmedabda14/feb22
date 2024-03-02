/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22feb;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author ahmed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
ArrayList<Integer> integers;
integers = new ArrayList<>();
integers.add(2);
integers.add(6);
integers.remove(Integer.valueOf(2));
ArrayList<String> car;
car = new ArrayList<>();
car.add(0,"honda");
car.add(1,"bmw");
car.add(2,"toyota");
car.add(3,"");
car.add(4,"");

car.set(3,"rolls");
car.set(4,"ferrari");

car.set(2,"audi");
car.remove("audi");
car.remove(0);
Collections.sort(car);
//car.clear();
for(int i=0;i<car.size();i++){
    System.out.print(car.get(i)+" ");
}
    }
    
}
