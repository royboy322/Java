// The FileOperator class that includes methods for file input and output
// Michael Roy

import java.io.*;

public class FileOperator {
    // instance variables
    private File m_file;

    // constructor
    // Do not make any changes to this method!
    public FileOperator() {
        String fileName = "employeeData.txt";
        m_file = new File(fileName);
    }

    // This method writes an array of Employees into a physical file.
    // Each line is in this format: "S-Optimus Prime-Computer Science-$1200"
    // "S" represents StudentWorker ("F" represents Faculty)
    public void writeFile(Employee[] employees) throws IOException {
        // Create a new file
        m_file.createNewFile();

        // Create a FileWriter object
        FileWriter writer = new FileWriter(m_file);

        // Iterate over the employees and add each line to the file
        for (Employee employee : employees) {
            String line;
            if (employee instanceof Faculty) {
                // Faculty
                line = String.format("F-%s\n", employee.getPaycheck());
            } else {
                // Student Worker
                line = String.format("S-%s\n", employee.getPaycheck());
            }
            // Write line to the file
            writer.write(line);
        }

        // Flush and close the FileWriter
        writer.flush();
        writer.close();
    }

}
