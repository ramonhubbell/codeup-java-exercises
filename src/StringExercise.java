import java.util.Scanner;

public class StringExercise {
    public static void main (String [] args) {
        System.out.println("Stings exercises are ready!");

//        For each of the following output examples: create
//        a String variable that contains the desired output
//        and print it out to the console, you can do this with
//        only one String variable and one print statement for
//        each output example.

//        We don't need no education
//        We don't need no thought control

        String pinkSong = "We don't need no education.";
        System.out.println(pinkSong);
        String pinkSongLine = pinkSong.replace("education", "thought control");
        System.out.println(pinkSongLine);

//        Check "this" out!, "s inside of "s!

        String string2 = "Check \"this\" out!, \"s inside of \"s!";
//        String quoteString2 = string2.
        System.out.println(string2);

//        In windows, the main drive is usually C:\

        String string3 = "In windows, the main drive is usually C:\\";
        System.out.println(string3);

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!

        String string4 =  "I can do backlashes \\, double backlashes \\\\,\nand the amazing triple backlashes \\\\\\!";
        System.out.println(string4);



    }
}
