/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.newpackage;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Seven {
    
    static Scanner My_Scanner=new Scanner(System.in);
     private static  OurThreads Thread1=new OurThreads();
     private static OurThreads Thread2=new OurThreads();
     private static OurThreads Thread3=new OurThreads();
    public static void main(String []args){
      
        
        Thread1.OurThreads("child 1", 8, 1, 500,true);
        Thread2.OurThreads("child 2", 100,10 , 100, true);
        Thread3.OurThreads("child 3", 1000, 100, 2000, true);
        
        //super threads class method
        
        Thread1.start();Thread2.start();Thread3.start();
        
        System.out.println("Please Enter the Command:");
        
        String StringCommand=My_Scanner.nextLine();
        
        while(!StringCommand.toLowerCase().equals("exit")){
            
            if(StringCommand.equals("1")){
                System.out.println("Counter in Thread 1"+Thread1.getCounter());
                ThreadStatus();
                
            }
            else if(StringCommand.equals("2")){
                System.out.println("Counter in Thread 2"+Thread2.getCounter());
                ThreadStatus();
            }
            else if(StringCommand.equals("3")){
                System.out.println("Counter Thread 3"+Thread3.getCounter());
                ThreadStatus();
            }
            
            else if(StringCommand.equals("1s")){
                Thread1.StopThread();
                System.out.println("Thread1 hasbeen Stoped");
                ThreadStatus();
            }
            else if(StringCommand.equals("2s")){
                Thread2.StopThread();
                System.out.println("Thread1 hasbeen Stoped");
                ThreadStatus();
            }
            else if(StringCommand.equals("3s")){
                Thread3.StopThread();
                System.out.println("Thread1 hasbeen Stoped");
                ThreadStatus();
            }
            else{
                System.out.println("please give e poper command");
            }
            
            StringCommand=My_Scanner.nextLine();
            
        }
        
        
        
        
    }
    
    private static void ThreadStatus(){
        System.out.println("Thread 1 is Alive:"+Thread1.isAlive());
        System.out.println("Thread 2 is Alive:"+Thread2.isAlive());
        System.out.println("Thread 3 is Alive:"+Thread3.isAlive());
    }
            
         

    
}
