//Michael Roy

public class TestShapes
{
    static Shape[] myShapes;
    static int numTotalTests;
    static int numPassedTests;

    public static void main(String[] args)
    {
        numPassedTests = 0;
        numTotalTests = 0;

        // Tests for creating and adding objects into the Shape array
        int[] shapeTypes = {0, 1, 1, 2, 2};
        String[] colors = {"Red", "White", "Blue", "Yellow", "Green"};
        double[][] sizes = {{}, {5.5}, {3.5}, {2.5, 6.3}, {1.0, 4.0}};

        // create an array of Shapes
        myShapes = new Shape[shapeTypes.length];

        for (int i = 0; i < shapeTypes.length; i++)
            testAddObject(shapeTypes[i], colors[i], sizes[i]);

        // Tests for printing the contents of each object saved in the Shape array
        String[] expOutputs = {
                "  Color: Red\n  Area: 0.0\n  Perimeter: 0.0\n",
                "  Color: White\n  Area: 94.985\n  Perimeter: 34.54\n",
                "  Color: Blue\n  Area: 38.465\n  Perimeter: 21.98\n",
                "  Color: Yellow\n  Area: 15.75\n  Perimeter: 17.6\n",
                "  Color: Green\n  Area: 4.0\n  Perimeter: 10.0\n"
        };

        for (int i = 0; i < shapeTypes.length; i++)
            testShapesArray(myShapes[i], expOutputs[i]);

        System.out.println("Total test cases: " + numTotalTests + "\nCorrect: " + numPassedTests + "\nWrong: " + (numTotalTests - numPassedTests));
    }

    static void testAddObject(int shapeType, String color, double[] size)
    {
        String shape = "";
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            if (shapeType == 1) // 1 represents Circle
            {
                shape = "Circle(\"" + color + "\", " + size[0] + ")";
                myShapes[numTotalTests] = new Circle(color, size[0]);
            }
            else if (shapeType == 2) // 2 represents Rectangle
            {
                shape = "Rectangle(\"" + color + "\", " + size[0] + ", " + size[1] + ")";
                myShapes[numTotalTests] = new Rectangle(color, size[0], size[1]);
            }
            else // by default, it creates a Shape object
            {
                shape = "Shape(\"" + color + "\")";
                myShapes[numTotalTests] = new Shape(color);
            }

            numPassedTests++;
            testResult = "[Passed]";
        } catch (RuntimeException e)
        {
            eMsg = "RuntimeException - \"" + e.getMessage() + "\"";
        }

        numTotalTests++;
        String text = "Test " + numTotalTests + ": Create and add " + shape + " ==> " + testResult + "\n";
        System.out.println(text);
        if (!eMsg.equals("N/A"))
            System.out.println(" " + eMsg + "\n");
    }

    static void testShapesArray(Shape input, String expOutput) {
        String objectClass = "N/A";
        String sReturn = "";
        String testResult = "[Failed]";
        String eMsg = "N/A";

        try
        {
            sReturn = input.toString();
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
        String text = "Test " + numTotalTests + ": TestOutput for object " + objectClass + " ==> " + testResult + "\n Expected: \n" + expOutput;
        System.out.println(text);
        if (eMsg.equals("N/A"))
            System.out.println(" Yours: \n" + sReturn);
        else
            System.out.println(" Yours: " + eMsg + "\n");
    }
}
