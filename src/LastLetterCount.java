/*
* Create LastLetterCount class in JAVA and then do the following:
Ask User to enter a sentence or create a String variable to assign a sentence to it
Count all words that ends in 's' in a String and words that ends in 'y' in a String
Switch the first instance of word that end with 's' and 'y'
Display the new sentence where words are switched
* Input: This is used for any tool and technology.
* Output: any is used for this tool and technology.
Switched: the first occurrence of word ending with 's' and 'y'
* */

import java.util.Scanner;

public class LastLetterCount {

    public void call(){
        System.out.println("This is a LastLetterCount Class call");
    }
    private String str = "";
    private String newStr = "";

    public void LastLetterCount(){
        System.out.println("\nLastLetterCount Class: ");

        System.out.print("Please enter string: ");
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        //prints string enter
        System.out.println(str);

        String[] strArr = str.split(" ");

        boolean endYFound = false;
        boolean endSFound = false;
        String endYWord = "";
        String endSWord = "";
        int yIndex = 0;
        int sIndex = 0;

        for(int i = 0; i < strArr.length; i++){

            if(!endYFound && strArr[i].charAt(strArr[i].length()-1 ) == 'y'
                    || strArr[i].charAt(strArr[i].length()-1 ) == 'Y'  ){

                endYFound = true;
                endYWord = strArr[i];
                yIndex = i;
            }
            if(!endSFound && strArr[i].charAt(strArr[i].length()-1 ) == 's'
                    || strArr[i].charAt(strArr[i].length()-1 ) == 'S'  ){

                endSFound = true;
                endSWord = strArr[i];
                sIndex = i;
            }

        }

        if(endYFound && endSFound){

            strArr[yIndex] = endSWord;
            strArr[sIndex] = endYWord;

            for (String s : strArr){
                newStr += s+" ";
            }
            System.out.print(newStr);
        }else{
            System.out.println("String does not have both: a word ending with 's' or a word ending with 'y'");
        }

    }
}
