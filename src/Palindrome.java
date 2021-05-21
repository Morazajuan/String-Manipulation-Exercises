import java.util.Scanner;

/*
Create Palindrome class in JAVA and then do the following:
-Ask User to enter a word or create a String variable and assign a word to it
-Reverse a String and check if string in Palindrome Definition of Palindrome:
 */
public class Palindrome {
    public void call(){
        System.out.println("This is a Palindrome Class call");
    }
    private String str = "";

    //overloading
    public boolean isPalindrome( String s){
        //we only have to go through the middle of it to find out
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }
        }

        return true;
    }

    public void isPalindrome(){
        System.out.println("\nPalindrome Class: ");

        System.out.print("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        //prints string enter
        System.out.println(str);


        //lowercase all char in string
        str = str.toLowerCase();

        if(isPalindrome(str)){
            System.out.println("String IS palindrome");
        }else{
            System.out.println("String IS NOT palindrome");
        }

    }

}
