// Michael Roy 

import java.util.Scanner;

public class TestBST
{
    public static void main(String[] args)
    {
        BST mytree = new BST();
        int numPassedTests = 0;
        int numTotalTests = 0;
        String testResult;

        // Test 1
        numTotalTests++;
        String sReturn = "";
        testResult = "[Failed]";
        String eMsg = "N/A";
        try
        {
            // insert values
            mytree.add("5");
            mytree.add("1");
            mytree.add("3");
            mytree.add("9");
            mytree.add("6");
            mytree.add("7");
            mytree.add("2");
            mytree.add("0");

            sReturn = mytree.inOrder().trim();

            if (sReturn.equals("0 1 2 3 5 6 7 9"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": inOrder() ==> " + testResult + "\n Expected: 0 1 2 3 5 6 7 9");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 2
        numTotalTests++;
        int iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = mytree.size();

            if (iReturn == 8)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 8");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 3
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = mytree.max();

            if (sReturn.equals("9"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": max() ==> " + testResult + "\n Expected: 9");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 4
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            mytree.clear();

            // insert values
            mytree.add("ab");
            mytree.add("bc");
            mytree.add("ac");
            mytree.add("de");
            mytree.add("ae");
            mytree.add("ck");
            mytree.add("dg");
            mytree.add("bp");
            mytree.add("eh");
            mytree.add("ck");

            sReturn = mytree.inOrder().trim();

            if (sReturn.equals("ab ac ae bc bp ck de dg eh"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": inOrder() ==> " + testResult + "\n Expected: ab ac ae bc bp ck de dg eh");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 5
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = mytree.size();

            if (iReturn == 9)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 9");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 6
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = mytree.max();

            if (sReturn.equals("eh"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": max() ==> " + testResult + "\n Expected: eh");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 7
        numTotalTests++;
        sReturn = "";
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            mytree.clear();

            // insert values
            mytree.add("@");
            mytree.add("?");
            mytree.add("=");
            mytree.add("/");
            mytree.add("-");
            mytree.add("+");
            mytree.add("*");
            mytree.add("%");

            sReturn = mytree.inOrder().trim();

            if (sReturn.equals("% * + - / = ? @"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": inOrder() ==> " + testResult + "\n Expected: % * + - / = ? @");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 8
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            iReturn = mytree.size();

            if (iReturn == 8)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": size() ==> " + testResult + "\n Expected: 8");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 9
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            sReturn = mytree.max();

            if (sReturn.equals("@"))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": max() ==> " + testResult + "\n Expected: @");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 10
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            // build a binary expression tree
            BSTNode root = new BSTNode("*");
            root.setRight(new BSTNode("3"));
            root.setLeft(new BSTNode("+"));
            root.getLeft().setLeft(new BSTNode("15"));
            root.getLeft().setRight(new BSTNode("21"));

            iReturn = mytree.evaluate(root.getLeft());

            if (iReturn == 36)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": evaluate(root), where root points to \"+\" in the following tree ==> " + testResult + "\n");
        System.out.println(String.format("%8s\n%9s\n%10s\n%7s\n%9s\n", "*", "/ \\", "+   3", "/ \\", "15  21") + "\n Expected: 36");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 11
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            // build a binary expression tree
            BSTNode root = new BSTNode("*");
            root.setRight(new BSTNode("3"));
            root.setLeft(new BSTNode("+"));
            root.getLeft().setLeft(new BSTNode("15"));
            root.getLeft().setRight(new BSTNode("21"));

            iReturn = mytree.evaluate(root);

            if (iReturn == 108)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": evaluate(root), where root points to \"*\" in the following tree ==> " + testResult + "\n");
        System.out.println(String.format("%8s\n%9s\n%10s\n%7s\n%9s\n", "*", "/ \\", "+   3", "/ \\", "15  21") + "\n Expected: 108");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        // Test 12
        numTotalTests++;
        iReturn = -1;
        testResult = "[Failed]";
        eMsg = "N/A";
        try
        {
            // build a binary expression tree
            BSTNode root = new BSTNode("/");
            root.setRight(new BSTNode("+"));
            root.setLeft(new BSTNode("*"));
            BSTNode left = root.getLeft();
            BSTNode right = root.getRight();

            left.setLeft(new BSTNode("-"));
            left.setRight(new BSTNode("+"));

            right.setLeft(new BSTNode("8"));
            right.setRight(new BSTNode("15"));

            left.getLeft().setLeft(new BSTNode("33"));
            left.getLeft().setRight(new BSTNode("44"));

            left.getRight().setLeft(new BSTNode("27"));
            left.getRight().setRight(new BSTNode("19"));

            iReturn = mytree.evaluate(root);

            if (iReturn == -22)
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        }
        catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage()  + "\"";
        }

        System.out.println("Test " + numTotalTests + ": evaluate(root), where root points to \"/\" in the following tree ==> " + testResult + "\n");
        System.out.println(String.format("%14s\n%17s\n%18s\n%19s\n%20s\n%13s\n%14s\n", "/", "/      \\", "*        +", "/    \\   /  \\", "-     +   8  15", "/ \\   / \\", "33 44 27 19") + "\n Expected: -22");
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: " + iReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }
}

