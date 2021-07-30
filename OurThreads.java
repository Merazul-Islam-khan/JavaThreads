/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads.newpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class OurThreads extends Thread {

    private String ThreadName;
    private int StartingPoint;
    private int Counter;
    private int adder;
    private int TimeDifference;

    private boolean threadAliveFlag;

   
    public void OurThreads(String ThreadName, int StartingPoint, int adder, int TimeDifference, boolean threadAliveFlag) {

        this.ThreadName = ThreadName;
        this.StartingPoint = StartingPoint;
        this.TimeDifference = TimeDifference;
        this.adder = adder;
        this.threadAliveFlag = threadAliveFlag;
    }
    //...........Run Method...........
    @Override
    public void run() {
        Counter=StartingPoint;
        
        while(threadAliveFlag){
            Counter+=adder;
            
            try {
                sleep(TimeDifference);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
                
        }
    }
      

    public void StopThread(){
        
        threadAliveFlag=false;
    }
    //private data type get the getter and setter method

    public int getStartingPoint() {
        return StartingPoint;
    }

    public void setStartingPoint(int StartingPoint) {
        this.StartingPoint = StartingPoint;
    }

    public int getCounter() {
        return Counter;
    }

    public void setCounter(int Counter) {
        this.Counter = Counter;
    }

    public int getAdder() {
        return adder;
    }

    public void setAdder(int adder) {
        this.adder = adder;
    }

    public int getTimeDifference() {
        return TimeDifference;
    }

    public void setTimeDifference(int TimeDifference) {
        this.TimeDifference = TimeDifference;
    }

    public boolean isThreadAliveFlag() {
        return threadAliveFlag;
    }

    public void setThreadAliveFlag(boolean threadAliveFlag) {
        this.threadAliveFlag = threadAliveFlag;
    }

    
    public String getThreadName() {
        return ThreadName;
    }

    public void setThreadName(String ThreadName) {
        this.ThreadName = ThreadName;
    }
}
   



