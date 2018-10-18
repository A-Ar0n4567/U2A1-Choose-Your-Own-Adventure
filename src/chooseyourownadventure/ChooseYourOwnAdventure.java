/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseyourownadventure;
import java.util.Scanner;
/**
 *
 * @author aamir7110
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyedInput = new Scanner(System.in);
        
        int progress =0;
        
        String Choice;
 
        System.out.println("You Wake Up In A room with a door to your left and your right");
        System.out.println("Type Left Through he Left Door Or Type Right To Go Through The Right door");
        Choice = keyedInput.nextLine();
            
        if(Choice.equals("Left")){
            
            System.out.println("The Door Leads To A Long Hallway With A Door At The end");
            
            progress = 1;
        }else{
            
            System.out.println("Oh No! The Door Was A Trap! Now Your dead.");
            
            progress =0;
        }
        if(progress ==1){
            
            System.out.println("Go Through The Door? Or Go Back The Other Way");
           
            System.out.println("Type Open To Open The Door or Type Back To Go Back And Enter The Other Door");
            
            Choice = keyedInput.nextLine();
            
            if(Choice.equals("Open")){
            
                progress =2;
                
                System.out.println("The Door Leads to A Path That Splits 3 Ways.");
                
                System.out.println("Type Left To Go Left Or Type Right To Go Right or Forward To Go Forward");
            }else{
                
                progress =0;
                
                System.out.println("Oh No! The Door Was A Trap! You Died!");
            }
            
        }
        if(progress==2){
            Choice = keyedInput.nextLine();
            
            switch(Choice){
                case"Left":
                    System.out.println("Oh No! Big Scary Monster!!! You Died!");
                    break;
                    
                case"Right":
                    System.out.println("The path Turns To THe Left And You See a Door Straight Ahead");
                   progress =3;
                    break;
                    
                case"Forward":
                    System.out.println("The Path Bends To The Right And You See A Door At The End Of The Pathway");
                    progress =3;
                    break;    
            }
            if(progress ==3){
                System.out.println("Do You want To Open The Door?");
                System.out.println("Type Yes To Open The Door Type No To Continue Down The Hallway");
                Choice = keyedInput.nextLine();
                if(Choice.equals("Yes")){
                    System.out.println("YAY YOU MADE IT OUT OF THE MAZE");
                }else{
                    System.out.println("The Pathway leads you back the the 3 way split ");
                    progress =2;
                }
            }
        }
    }
}
                
            
        
        
        
    
    

