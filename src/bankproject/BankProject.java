/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankproject;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author joham3169
 */
public class BankProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("AccountData.dat");
        
        Scanner UI = new Scanner(System.in);
        String Input = String.valueOf(UI);
        double Bal = 0;
        
        BufferedReader reader = null;
        FileWriter out;
        BufferedWriter writefile;

        
            try{
                out = new FileWriter(file, true);
                writefile = new BufferedWriter(out);
                System.out.println("If you want to create a new account press N");
                System.out.println("If you want to delete an account press D");
                System.out.println("If you want to manage an existing account press M");
                        
                String AccountManagement = UI.next();
                    for (int i = 0; i < 1; i++){   
                        try{
                            if (AccountManagement.equals("N") || AccountManagement.equals("n")){
                                System.out.println("Please Enter Your Name");
                                String name = UI.next();
                                System.out.println("Enter Your Account Balance");
                                Bal = UI.nextDouble();
                                writefile.write(name + ":" + "         $" + Bal);
                                writefile.newLine();
                                }
                            }
                    
                            catch(InputMismatchException e){
                                 System.out.println("Sorry That is Not a Valid Option");
                                 System.out.println("Next Time Please Give A Number");
                            }
                            if (AccountManagement.equals("d") || AccountManagement.equals("D")){
                                System.out.println("This Function does not currently Work");
                            }
                            if (AccountManagement.equals("m") || AccountManagement.equals("M")){
                                System.out.println("This Function does not currently Work");
                            }
                    }
                writefile.close();
                out.close();
                reader = new BufferedReader(new FileReader(file));
                //System.out.println(reader);
            }
            
            catch(IOException e){
                System.out.println("IOException error: " + e.getMessage());  
            } 
        }
    }