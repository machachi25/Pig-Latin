import java.util.Scanner;

public class PigLatin
{
    public static void main(String [] args)
    {
       //Rules of pig latin: put last consonant or consonant cluster at the beginning and add "ay" to the end of the word (e.g. - pig --> igpay)
        String phrase;
        int len;
        System.out.println("Enter a word of your choosing: ");
        Scanner scan = new Scanner(System.in);
        phrase = scan.nextLine();
        len = phrase.length();
        String temp;
        String constant = "ay";
        System.out.println(phrase + "" + constant);
        for(int i = 1; i < len; i++)
        {
            phrase.substring(i, i+1);
        }
    }
}