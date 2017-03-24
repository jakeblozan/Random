import java.util.Scanner;

/**
 * Calculates equivalent page for pdf to paperback version of Ishmael.
 * 
 * @author (Jake Blozan) 
 * @version (3/23/17)
 */
public class PageCalculator
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pdf = 160.0;
        double paperback = 263.0;
        int pageNumber = 0;
        System.out.print("Your page number or hers? ");
        String source = scan.next();
        System.out.print("What page? ");
        int page = scan.nextInt();
        if (source.equals("mine")) {
            double ratio = pdf / paperback;
            pageNumber =(int)(page / ratio);
            System.out.println("Her equivalent page number should be " + pageNumber);
        }
        else if (source.equals("hers")) {
            double ratio = paperback / pdf;
            pageNumber =(int)(page / ratio);
            System.out.println("Your equivalent page number should be " + pageNumber);
        }
        else {
            System.out.println("what the");
        }
    }
}
