// Test driver for the SortedPersonList class
// Michael Roy

public class TestPersonList 
{
    public static void main(String[] args)
    {
        SortedPersonList myList = new SortedPersonList();      
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;
        
        // Test 1
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            iReturn = myList.size();
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 0" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 2
        numTotalTests++;
        boolean bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1003, "Kungfu Panda");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1003, \"Kungfu Panda\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 3
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.isEmpty();
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": isEmpty() ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 4
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1005, "Donald Duck");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1005, \"Donald Duck\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 5
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1001, "Pooh");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1001, \"Pooh\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 6
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = myList.size();
            
            if (iReturn == 3)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 3" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 7
        numTotalTests++;
        String sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = myList.toString();
            
            if (sReturn.equals("[1001 | Pooh] [1003 | Kungfu Panda] [1005 | Donald Duck] "))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": toString() ==> " + testResult + "\n Expected: [1001 | Pooh] [1003 | Kungfu Panda] [1005 | Donald Duck] " );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 8
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1001);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1001) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 9
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1002);
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1002) ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 10
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1003);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1003) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");          
        
        // Test 11
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1005);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1005) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 12
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.remove(1004);
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": remove(1004) ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 13
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.remove(1001);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": remove(1001) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");   

        // Test 14
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = myList.toString();
            
            if (sReturn.equals("[1003 | Kungfu Panda] [1005 | Donald Duck] "))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": toString() ==> " + testResult + "\n Expected: [1003 | Kungfu Panda] [1005 | Donald Duck] " );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 15
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1001);
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1001) ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 16
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1002, "Mickey Mouse");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1002, \"Mickey Mouse\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");   
        
        // Test 17
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1006, "Thanos");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1006, \"Thanos\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 18
        numTotalTests++;
        PersonNode pReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            pReturn = myList.get(1005);
            
            if (pReturn.getName().equals("Donald Duck"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": get(1005).getName() ==> " + testResult + "\n Expected: \"Donald Duck\"" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \"" + pReturn.getName() + "\"\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 19
        numTotalTests++;
        pReturn = null;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            pReturn = myList.get(1002);
            
            if (pReturn.getName().equals("Mickey Mouse"))
            {
                pReturn.setName("Megatron");
                iReturn = myList.size();
                
                if (iReturn == 4)
                {
                    numPassedTests++;
                    testResult = "[Passed]";
                }
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": get(1002).setName(\"Megatron\") and then size() ==> " + testResult + "\n Expected: 4" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");        

        // Test 20
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = myList.toString();
            
            if (sReturn.equals("[1002 | Megatron] [1003 | Kungfu Panda] [1005 | Donald Duck] [1006 | Thanos] "))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": toString() ==> " + testResult + "\n Expected: [1002 | Megatron] [1003 | Kungfu Panda] [1005 | Donald Duck] [1006 | Thanos] " );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 21
        numTotalTests++;
        pReturn = null;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            pReturn = myList.get(1008);
            
            if (pReturn == null)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": get(1008) ==> " + testResult + "\n Expected: null" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + pReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 22
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1005, "Optimus Prime");
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1005, \"Optimus Prime\") ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 23
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            myList.remove(1002);
            myList.remove(1003);
            myList.remove(1005);
            myList.remove(1006);
            
            bReturn = myList.isEmpty();
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": remove({1002, 1003, 1005, 1006}) and then isEmpty() ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 24
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = myList.size();
            
            if (iReturn == 0)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 0" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 25
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1006, "Popeye");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1006, \"Popeye\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 26
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1003, "Tom Cat");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1003, \"Tom Cat\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");  
        
        // Test 27
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.add(1004, "Bumblebee");
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": add(1004, \"Bumblebee\") ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 28
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = myList.toString();
            
            if (sReturn.equals("[1003 | Tom Cat] [1004 | Bumblebee] [1006 | Popeye] "))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": toString() ==> " + testResult + "\n Expected: [1003 | Tom Cat] [1004 | Bumblebee] [1006 | Popeye] " );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        // Test 29
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1004);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1004) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");          
        
        // Test 30
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.contains(1005);
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": contains(1005) ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 31
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.remove(1002);
            
            if (bReturn == false)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": remove(1002) ==> " + testResult + "\n Expected: false" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n"); 
        
        // Test 32
        numTotalTests++;
        bReturn = false;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            bReturn = myList.remove(1003);
            
            if (bReturn == true)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": remove(1003) ==> " + testResult + "\n Expected: true" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + bReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");         
        
        // Test 33
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = myList.size();
            
            if (iReturn == 2)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }
        
        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 2" );
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
        
        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));        
    }    
}
