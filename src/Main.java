import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        console.close();
    }

    private static void printNameLength( String name )
    {
    	for (int a = 0; a<name.length(); a++) {
    		System.out.println(name.charAt(a));
    		}//for
    	
    }

    private static void printNameCharacters( String name )
    {
    	for (int b = 0; b< name.length();) {
    	System.out.println( "El numero de caractares es: " + b );
    }


}}