/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg22feb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
/**
 * comparable affects real memory 
 * comparator is temporary
 * @author ahmed
 */
class Author1{
    String firsname;
    String bookname;
    int authorage;

    public Author1(String firsname, String bookname, int authorage) {
        this.firsname = firsname;
        this.bookname = bookname;
        this.authorage = authorage;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthorage(int authorage) {
        this.authorage = authorage;
    }

    public String getFirsname() {
        return firsname;
    }

    public String getBookname() {
        return bookname;
    }

    public int getAuthorage() {
        return authorage;
    }

    @Override
    public String toString() {
        return "Author1{" + "firsname=" + firsname + ", bookname=" + bookname + ", authorage=" + authorage + '}';
    }
    
}
class AuthorAgeComparator implements Comparator<Author1>{
    @Override
    public int compare(Author1 o1, Author1 o2){
        if(o1.authorage==o2.authorage)
        return 0;
        else if(o1.authorage>o2.authorage)
        return 1;
        else
            return -1;
    }
}
class BookNameComparator implements Comparator<Author1>{
    @Override
    public int compare(Author1 o1, Author1 o2){
        return o1.bookname.compareTo(o2.bookname);
    }
 
}

public class ComparableDemo1 {
                        public static void main(String[] args) {
                            ArrayList<Author1> authorlist = new ArrayList<>();
                            //authorlist.toString();
                           
                          authorlist.add(new Author1("zag","dubois",43));
                        authorlist.add(new Author1("bibi","aksljl",12));
            authorlist.add(new Author1("medd","abd",23));
            System.out.println("Author is sorted upon the age");
                                    Collections.sort(authorlist, new AuthorAgeComparator());

             for(Author1 i: authorlist){
                            System.out.println(i.getAuthorage()+" "+i.getBookname()+" "+i.firsname);
                        }
                        Collections.sort(authorlist, new AuthorAgeComparator());
                                    System.out.println("Author is sorted upon the book name");
Collections.sort(authorlist, new BookNameComparator());
                        for(Author1 i: authorlist){
                            System.out.println(i.getAuthorage()+" "+i.getBookname()+" "+i.firsname);
                        }
                        }
}
