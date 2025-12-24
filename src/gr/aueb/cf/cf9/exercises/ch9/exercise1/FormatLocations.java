package gr.aueb.cf.cf9.exercises.ch9.exercise1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class FormatLocations {

    public static void main(String[] args) {
        String inFilePath = "C:\\Users\\chris\\Coding Factory 9\\Java\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\exercises\\ch9\\exercise1\\locations.txt";
        String outFilePath = "C:\\Users\\chris\\Coding Factory 9\\Java\\IdeaProjects\\CodingFactory9\\src\\gr\\aueb\\cf\\cf9\\exercises\\ch9\\exercise1\\locations-formatted.txt";
        File file = new File(inFilePath);
        String[][] data = new String[1000][3];

        try {
            data = getLocationData(file);
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found " + e.getMessage());
        }

        try {
            printLocationData(data, outFilePath);
        } catch (IOException e) {
            System.out.println("Error when writing data" + e.getMessage());
        }

    }

    public static String[][] getLocationData(File file) throws FileNotFoundException {
        String location;
        String latitude ;
        String longitude;
        String line;
        String[] parts;
        int count = -1;
        String[][] returnedArray = new String[1000][3];

        try (Scanner scanner = new Scanner(file)) {

            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                count++;
                line = scanner.nextLine();
                parts = line.split(",");

                location = parts[0];
                latitude = parts[1];
                longitude = parts[2];

                returnedArray[count][0] = location;
                returnedArray[count][1] = latitude;
                returnedArray[count][2] = longitude;
            }
            return Arrays.copyOf(returnedArray, count);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static void printLocationData(String[][] data, String filePath) throws IOException{
        try(PrintStream ps = new PrintStream(filePath)) {

            for (String[] row : data) {
                ps.printf("{ location: %s, latitude: %s, longitude: %s }\n",
                        row[0], row[1], row[2]);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
