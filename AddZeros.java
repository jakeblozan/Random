import java.io.*;
import java.util.Scanner;

/**
 * Adds spaces after commas
 *
 * @author (Jake Blozan)
 * @version (4/4/19)
 */
public class AddZeros
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input file location:");
        String fileName = scan.nextLine();
        String output = "";

        String temp = "";
        String text;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((text = reader.readLine()) != null) {
                temp += (text+ "  0\n");
            }
            reader.close();

            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(temp);
            writer.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }

    }
}
