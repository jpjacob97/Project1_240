/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;
import java.util.Scanner;
/**
 *
 * @author jacobpetersen
 */
public class Lab9 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1=new Person("Alice");
        Person p2=new Person("Clarence");
        p1.getName();
        p1.addFriend("Tim");
        p1.addFriend("Bill");
        p1.addFriend("Connor");
        p1.addFriend("Md");
        p1.addFriend("Nate");
        p1.addFriend("Joe");
        p1.hasFriend("Tim");
        p1.hasFriend("Joe");
        p2.hasFriend("Joe");

    }
    
}
