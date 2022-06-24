/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author romeodellosa
 */
import java.util.Scanner;
public class TestUserprofile{
   public static void main(System[]args){
       Scanner sc = new Scanner(System.in);
 
          String temp1,temp2;
          //String[] temp3 = UserProfile.genres;
          System.out.println("Enter Username: ");
          temp1 = sc.nextLine();
          System.out.print("Enter genre: ");
          temp2 = sc.nextLine();
          
          System.out.println("Name" + temp1 + "Your Genres" + temp2);
               
   }
}