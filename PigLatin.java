import java.util.Scanner;

public class PigLatin
{
    public static void main(String [] args)
    {
        String phrase;
        int len;
        System.out.println("Enter a word of your choosing: ");
        Scanner scan = new Scanner(System.in);
        phrase = scan.nextLine();
        len = phrase.length;
        for(int i =0; i < len; i++)
        {
            phrase.substring(i, i+1);
        }
    }
}