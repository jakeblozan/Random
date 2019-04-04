import java.util.Scanner;

/**
 * Adds spaces after commas
 *
 * @author (Jake Blozan)
 * @version (4/4/19)
 */
public class SpaceAdder
{
    public static void main(String [] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input string:");
            String input = scan.nextLine();
            String output = "";
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ',') {
                    output += ", ";
                }
                else {
                    output += input.charAt(i);
                }
            }
            System.out.println(output);
        }
    }
}
