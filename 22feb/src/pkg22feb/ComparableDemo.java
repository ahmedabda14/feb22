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
class Author implements Comparable<Author>{
    String firstname;
    String lastname;
    String bookname;

    public Author(String firstname, String lastname, String bookname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bookname = bookname;
    }

    @Override
    public int compareTo(Author o) {
    return this.lastname.compareTo(lastname);
    }
    
}
public class ComparableDemo {
                public static void main(String[] args) {
            ArrayList<Author> authorlist = new ArrayList<Author>();
            
            
                        authorlist.add(new Author("bibi","aksljl","mosk"));
            authorlist.add(new Author("medd","abd","kitchen"));
            authorlist.add(new Author("amadou","dubois","kokok"));
            Collections.sort(authorlist);
System.out.println("sorted authors by last name: ");
for(Author a : authorlist){
    System.out.println("first name: "+a.firstname+" last name: "+a.lastname+" book name: "+a.bookname);
}
                }
}
