package za.co.cput.maven;

/**
 * HighestNumberOf3
 * Author: Amy Johnston (218188773)
 */
public class App 
{
    public static void main( String[] args )
    {
        int a = 121;
        int b = 313;
        int c = 90;
        
        System.out.print("Out of; " + a + ", " + b + ", and" + c + " the highest number is: ");
        System.out.println(Math.max(Math.max(a, b), c));
    }
}
