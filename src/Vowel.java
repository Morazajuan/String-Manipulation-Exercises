import java.util.Scanner;

/*
Create Vowels class in JAVA then do the following:
-Ask User to enter a sentence or create a String variable to assign a sentence to it
-Count all the vowels in a sentence and display the count
* */
public class Vowel {
    //this method is for testing purposes
    public void call(){
        System.out.println("This is a Vowel Class call");
    }

    private String str = "";
    private int vowelCount = 0;

    public void vowelCount (){

        System.out.print("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        //prints string enter
        System.out.println(str);

        //count vowels in string
        char [] vowles ={'a','e','i','o', 'u'};
        int capital =  'a' - 'A';
        for(char c : str.toCharArray()){
            for( char v : vowles){
                //check for lowercase and uppercase
                if(c == v || c == (v - capital) ){
                    vowelCount++;
                }
            }

        }

        System.out.println("There are "+ vowelCount + " vowels in the string typed");

    }


}
