// Test driver for the StackRecursion class
// Michael Roy

import java.util.*;
import java.io.*;

public class TestStackRecursion
{
    static StackRecursion mySR;
    static int numTotalTests;
    static int numPassedTests;

    public static void main(String[] args)
    {
        mySR = new StackRecursion();
        
        numPassedTests = 0;
        numTotalTests = 0;

        // Tests for subtractBigInteger
        testSubtractBigInteger();

        // Tests for computePI
        int[] input1 = {1, 4, 7, 1000};
        double[] expOutput1 = {4, 2.8952, 3.2837, 3.1406};
        for (int i = 0; i < input1.length; i++)
            testComputePI(input1[i], expOutput1[i]);

        // Tests for reverseStringRec
        String[] input2 = {"", "1", "123", "Hello, Data Structures!"};
        String[] expOutput2 = {"", "1", "321", "!serutcurtS ataD ,olleH"};
        for (int i = 0; i < input2.length; i++)
            testReverseStringRec(input2[i], expOutput2[i]);

        // Tests for numOccurrencesRec
        int[][] input3 = {{-999},
                {20},
                {20},
                {45, 25, 73, 45, 19, 57, 45},
                {45, 25, 73, 25, 19, 25, 43, 25},
                {45, 25, 73, 25, 19, 25, 19, 45}};
        int[] inN = {0, 0, 0, 0, 1, 4};
        int[] inKey = {10, 10, 20, 45, 25, 19};
        int[] expOutput3 = {0, 0, 1, 3, 4, 2};
        for (int i = 0; i < input3.length; i++)
            testNumOccurrencesRec(input3[i], inN[i], inKey[i], expOutput3[i]);

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    static void testComputePI(int input, double expOutput)
    {
        double dReturn = -1;
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            dReturn = mySR.computePI(input);
            dReturn = Math.round(dReturn * 10000D) / 10000D;

            if (dReturn == expOutput)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": computePI(" + input + ") ==> " + testResult + "\n Expected: " + expOutput;
        printMessage(eMsg, text, "" + dReturn);
    }

    static void testReverseStringRec(String input, String expOutput)
    {
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            sReturn = mySR.reverseStringRec(input);

            if (sReturn.equals(expOutput))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": reverseStringRec(\"" + input + "\") ==> " + testResult + "\n Expected: \"" + expOutput + "\"";
        printMessage(eMsg, text, "" + sReturn);
    }

    static void testNumOccurrencesRec(int[] inArray, int inN, int inKey, int expOutput)
    {
        int iReturn = -1;
        String testResult = "[Failed]";
        String eMsg = "N/A";
        String list = Arrays.toString(inArray).replaceAll(", ", "->").replaceAll("-999", "NULL");

        try
        {
            // reverse the array
            for (int i = 0; i < inArray.length / 2; i++)
            {
                int tmp = inArray[i];
                inArray[i] = inArray[inArray.length - 1 - i];
                inArray[inArray.length - 1 - i] = tmp;
            }

            // build the list from the reversed array
            LNode head = null;
            for (int i = 0; i < inArray.length; i++)
            {
                if (inArray[i] == -999)
                    break;

                LNode myNode = new LNode(inArray[i]);
                myNode.setLink(head);
                head = myNode;
            }

            iReturn = mySR.numOccurrencesRec(head, inN, inKey);

            if (iReturn == expOutput)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": numOccurrencesRec(" + list + ", " + inN + ", " + inKey + ") ==> " + testResult + "\n Expected: " + expOutput;
        printMessage(eMsg, text, "" + iReturn);
    }

    public static void testSubtractBigInteger()
    {
        try
        {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("testNumbers.dat"));
            ArrayList<Integer> results = new ArrayList<Integer>();
            ArrayList<String> numbers = new ArrayList<String>();
            results = (ArrayList<Integer>)in.readObject();
            numbers = (ArrayList<String>)in.readObject();

            String r;
            String testResult;
            String eMsg;
            String currentLine;

            for (int i = 0; i < numbers.size(); i++)
            {
                testResult = "[Failed]";
                eMsg = "N/A";
                currentLine = numbers.get(i);
                String[] operands = currentLine.split(" ");
                CharStack num1 = new CharStack(64);    // stack used to store number 1
                CharStack num2 = new CharStack(64);    // stack used to store number 2

                // push digits of number 1 onto stack
                for (int j = 0; j < operands[0].length(); j++)
                    num1.push(operands[0].charAt(j));

                // push digits of number 2 onto stack
                for (int j = 0; j < operands[1].length(); j++)
                    num2.push(operands[1].charAt(j));

                r = "";
                eMsg = "N/A";
                try
                {
                    r = mySR.subtractBigInteger(num1, num2);
                    if (r.equals(results.get(i)))
                    {
                        numPassedTests++;
                        testResult = "[Passed]";
                    }
                }
                catch (RuntimeException e)
                {
                    eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
                }

                numTotalTests++;
                String text = "Test " + numTotalTests + ": subtractBigInteger(" + operands[0] + " - " + operands[1] + ") ==> " + testResult + "\n Expected: " + results.get(i);
                printMessage(eMsg, text, "" + r);
            }
        }
        catch (Exception e)
        {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    static void printMessage(String eMsg, String text, String ret)
    {
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + ret + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }
}
