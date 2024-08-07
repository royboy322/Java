// Test driver for the classes and their implementations
// Michael Roy

import java.io.*;
import java.util.Scanner;

public class TestEmployees
{
    static Employee[] myEmployees;
    static int numTotalTests;
    static int numPassedTests;

    public static void main(String[] args)
    {
        numPassedTests = 0;
        numTotalTests = 0;

        // Tests for creating and adding objects into the Shape array
        int[] employeeTypes = {0, 1, 1, 0, 1};
        String[] names = {"Bumble Bee", "Harry Potter", "Pooh", "Kungfu Panda", "Luigi"};
        String[] departments = {"Social Science", "Computer Science", "Accounting", "Finance", "Chemistry"};
        int[][] wages = {{80000, 0}, {20, 15}, {13, 20}, {95000, 0}, {17, 15}};

        // create an array of Employees
        myEmployees = new Employee[employeeTypes.length];

        for (int i = 0; i < employeeTypes.length; i++)
            testAddObject(employeeTypes[i], names[i], departments[i], wages[i]);

        // Tests for printing the contents of each object saved in the Shape array
        String[] expOutputs = {
                "Bumble Bee-Social Science-$80000",
                "Harry Potter-Computer Science-$300",
                "Pooh-Accounting-$260",
                "Kungfu Panda-Finance-$95000",
                "Luigi-Chemistry-$255"
        };

        for (int i = 0; i < employeeTypes.length; i++)
            testEmployeeArray(myEmployees[i], expOutputs[i]);

        // Test for writing array content to file
        String expFileContent = "";
        for (int i = 0; i < expOutputs.length; i++)
        {
            if (employeeTypes[i] == 0)
                expFileContent += "F-" + expOutputs[i] + "\n";
            else
                expFileContent += "S-" + expOutputs[i] + "\n";
        }

        testWriteToFile(myEmployees, expFileContent);

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    static void testAddObject(int employeeType, String name, String department, int[] wage)
    {
        String employee = "";
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            if (employeeType == 0) // 0 represents Faculty
            {
                employee = "Faculty(\"" + name + "\", \"" + department + "\", " + wage[0] + ")";
                myEmployees[numTotalTests] = new Faculty(name, department, wage[0]);
            }
            else if (employeeType == 1) // 1 represents StudentWorker
            {
                employee = "StudentWorker(\"" + name + "\", \"" + department + "\", " + wage[0] + ", " + wage[1] + ")";
                myEmployees[numTotalTests] = new StudentWorker(name, department, wage[0], wage[1]);
            }
            else
            {
                // by default, it does nothing
            }

            numPassedTests++;
            testResult = "[Passed]";
        } catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": Create and add " + employee + " ==> " + testResult + "\n";
        System.out.println(text);
        if (!eMsg.equals("N/A"))
            System.out.println(" " + eMsg + "\n");
    }

    static void testEmployeeArray(Employee input, String expOutput) {
        String objectClass = "N/A";
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            sReturn = input.getPaycheck();
            objectClass = input.getClass().getName();
            if (sReturn.equals(expOutput))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": getPaycheck() for object " + objectClass + " ==> " + testResult + "\n Expected: \n" + expOutput;
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \n" + sReturn + "\n");
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }

    static void testWriteToFile(Employee[] employees, String expOutput)
    {
        String content = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            FileOperator fo = new FileOperator();
            fo.writeFile(employees);

            File f = new File("employeeData.txt");
            Scanner fileIn = new Scanner(f);
            while (fileIn.hasNext())
            {
                String line = fileIn.nextLine();
                content += line + "\n";
            }
            fileIn.close();

            if (content.trim().equals(expOutput.trim()))
            {
                numPassedTests++;
                testResult = "[Passed]";
            }
        } catch (Exception e)
        {
            eMsg = "Exception - \"" + e.getMessage() + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": writeFile() ==> " + testResult + "\n Expected: \n" + expOutput;
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \n" + content);
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }
}
