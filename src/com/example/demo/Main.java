package com.example.demo;

import java.util.*;

public class Main
{
    public static void main ( String[] args )
    {
        /* Declare the Hashmap */
        HashMap < Integer, String > studentInfo = new HashMap <> ( );
        boolean  loopAgain  = true;
        Scanner  scan = new Scanner ( System.in );
    
        /* Loop while user doesn't enter quit */
        do {
            /* Ask for user to enter an  Id Number */
            System.out.print ( "Enter ID Number:" );
            Integer idNumber = Integer.parseInt ( scan.nextLine ( ) );
    
            /* Ask for to enter a  student name */
            System.out.print ( "Enter Name:" );
            String name = scan.nextLine ( );
    
            /* Add the key value pair from user input into the Hashmap */
            String input = studentInfo.put ( idNumber , name );
    
            if ( input != null ) {
                System.out.println ( "Student Id Number: " + idNumber + " is " + input + " and has been overwritten "
                                     + "by  " + name );
            }
    
            /* Ask user to continue entering info or quit the system */
            System.out.print ( "Enter yes to continue or quit to exit the system: " );
            String answer = scan.nextLine ( );
    
            /* Condition to satisfy in order to execute the loop again */
            if ( answer.equals ( "yes" ) || answer.equals ( "Yes" ) ) {
                continue;
            }
            else {
                break;
            }
    
        }
        while ( loopAgain );
        scan.close ( );
    
        System.out.println ( "\n**********************************" );
        System.out.println ( "The following students have been added into the system." );
        System.out.println ( " ID" + "  Name" );
        for ( int id : studentInfo.keySet ( ) ) {
            System.out.println ( "  " + id + "  " + studentInfo.get ( id ) );
        }
        System.out.println ( "\n**********************************" );
    }
}
    
