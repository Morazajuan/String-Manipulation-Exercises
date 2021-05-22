import java.util.Scanner;

/*
Create Consonants class in JAVA and then do the following:
-Ask User to enter a sentence or create a String variable to assign a sentence to it
-Count all consonants in a String and display the count
-Replace all consonants with '*' in a String

* */
public class Consonants {
    public void call(){
        System.out.println("This is a Consonants Class call");
    }

    private String str = "";
    public void countConsonants(){
        System.out.println("\nConsonant Class: ");

        System.out.print("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        int consonantsCount = 0;

        //prints string enter
        System.out.println(str);
        //B, C, D, F, G, J, K, L, M, N, P, Q, S, T, V, X, Z , H, R, W, Y
        char [] consonants ={'b','c','d','f', 'g','j','k','l' , 'm',
                'n', 'p', 'q', 's', 't', 'v', 'x', 'z', 'h', 'r', 'w', 'y'};

        int capital =  'b' - 'B';

        //this would be filled with * wherever there is any consonant
        String newStr = "";

        //same concept as vowles
        for(char c : str.toCharArray()){
            boolean foundConsonant = false;
            for( char v : consonants){
                //check for lowercase and uppercase
                if(c == v || c == (v - capital) ){
                    consonantsCount++;
                    newStr+= "*";
                    foundConsonant = true;
                    break;
                }

            }
            if(!foundConsonant){
                newStr+= c;

            }
        }

        System.out.println("There are "+ consonantsCount + " consonants in the string typed");
        System.out.println("Modified string: "+ newStr);
    }
}
