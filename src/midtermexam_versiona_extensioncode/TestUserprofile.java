/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author moeissa
 */
public class TestUserprofile {
    public static void main (String[] args){
    Scanner input= new Scanner(System.in);

    System.out.print("enter your name");
    String userID= input.nextLine();
    System.out.print("enter your FAVE GENRE");
    String userGenre= input.nextLine();
    UserProfile item= new UserProfile(userID, userGenre);
    System.out.println("user id" + item.getUserID());
    System.out.println("Favourite Genre " + item.getGenre());
    System.out.println("Your user Profile has been created");
    
    
    
    
    }
}
