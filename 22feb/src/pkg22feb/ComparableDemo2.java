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
class laptop implements Comparable<laptop>{
    String name;
    int ram;
    int price;

    public laptop(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "laptop{" + "name=" + name + ", ram=" + ram + ", price=" + price + '}';
    }
 
    @Override
    public int compareTo(laptop o){
     if(this.ram==o.getRam())
         return 0;
     else if (this.ram>o.getRam())
         return 1;
     else
         return -1;
    }
    
}
public class ComparableDemo2 {
                    public static void main(String[] args) {
                        ArrayList<laptop> listLaptop = new ArrayList<>();
                        listLaptop.add(new laptop("windows",16,1300));
                                                listLaptop.add(new laptop("Mac",8,2400));
                        listLaptop.add(new laptop("Linux",32,700));
                        listLaptop.add(new laptop("MainFrame",64,4000));
for(laptop l:listLaptop){
    System.out.print(l.getRam());
}
                    }
}
