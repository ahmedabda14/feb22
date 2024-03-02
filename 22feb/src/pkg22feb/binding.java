/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22feb;
import java.util.Random;
/**
 *
 * @author ahmed
 */class Animal{
     void sound(){
         System.out.println("animal makes a sound");
     }
 }
class dog extends Animal{
    void sound(){
        System.out.println("bark");
    }
}

class shape{
    void draw(){
                System.out.println("draw shape");

    }
}
class circle extends shape{
    void draw(){
                System.out.println("draw circle");

    }
}
class square extends shape{
    void draw(){
                System.out.println("draw square");

    }
}
public class binding {
        public static void main(String[] args) {
       Animal animal = new dog();
       animal.sound();
       
shape staticShape = new circle();
staticShape.draw();
//dynamic binding
shape dynamicShape = getRandomShape();
dynamicShape.draw();
        }
        
        static shape getRandomShape(){
            if(Math.random()<0.5){
                return new circle();
            }
            else{
                return new square();
            }
        }

}

