/*
Create Words class in JAVA and then do the following:
Ask User to enter a sentence or create a String variable to assign a sentence to it
Count all Words in a String and display the count
Display the count of word in a sentence

* */

import java.util.Scanner;

public class Words {
    public void call(){
        System.out.println("This is a Words Class call");
    }
    private String str = "";
    public void countWords(){
        System.out.println("\nWords Class: ");

        System.out.print("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        //prints string enter
        System.out.println(str);

        String []words = str.split(" ");

        System.out.println("There are "+words.length+ " words in string");

    }

}
