//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input
public class main {

    public static void main(String[] args)
    {
        //Your code here:
        Scanner talker = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = talker.nextInt();
        System.out.print("Enter the width: ");
        int width = talker.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.print("Length is " + length + ". Width is " + width + ". Area is " + area + ". Perimeter is " + perimeter + ".");
    }
}

//Paste console output below:
/*
Enter the length: 15
Enter the width: 13
Length is 15. Width is 13. Area is 195. Perimeter is 56.
 */
