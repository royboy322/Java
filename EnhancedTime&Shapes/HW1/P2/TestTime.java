//Michael Roy

import java.sql.Array;
import java.util.*;
import java.io.*;

public class TestTime
{
    public static void main(String[] args)
    {
        try
        {    
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("TestTimes.dat"));
            ArrayList<Time> oldTimes;
            ArrayList<Time> newTimes;
            ArrayList<Integer> secondsList;
            oldTimes = (ArrayList<Time>)in.readObject();
            newTimes = (ArrayList<Time>)in.readObject();
            secondsList = (ArrayList<Integer>)in.readObject();

            EnhancedTime currentTime;
            int numTotalTests = 0, numPassedTests = 0;
            
            for (int i = 0; i < oldTimes.size(); i++)
            {
                numTotalTests++;
                
                System.out.println("The current time is " + oldTimes.get(i) + " and " + secondsList.get(i) + " seconds are added.");
                currentTime = new EnhancedTime(oldTimes.get(i));
                currentTime.addSeconds(secondsList.get(i));
                System.out.println("The correct new time is " + newTimes.get(i) + " and the one calculated by your program is " + currentTime + ".");
                
                if (currentTime.toString().equals(newTimes.get(i).toString()))
                {
                    System.out.println("Correct!\n");
                    numPassedTests++;
                }
                else
                    System.out.println("Wrong!\n");
            }

            System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
        }
        catch (Exception e)
        {
           System.out.println("Error occurred: " + e.getMessage());   
        }
    }
}
		
