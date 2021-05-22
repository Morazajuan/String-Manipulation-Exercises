import java.util.Scanner;

public class StringManipulationExercises {
    public static void main(String[] args) {

        //created an object of each class required for assignment
        Vowel obj1 = new Vowel();
        Palindrome obj2 = new Palindrome();
        Words obj3 = new Words();

        Consonants obj4 = new Consonants();
        LastLetterCount obj5 = new LastLetterCount();

        //test call on every object created from all different classes
//        obj1.call();
//        obj2.call();
//        obj3.call();
//        obj4.call();
//        obj5.call();

//
//        //call to Vowel class
//         obj1.vowelCount();
//
//         //call to palindrome class
//        obj2.isPalindrome();

//         //call to words class
//        obj3.countWords();

        //call to consonant class
//        obj4.countConsonants();


        //call to consonant class
        String str = "";
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("Type number accordingly to task desired:");
            System.out.println("1. Vowel Class");
            System.out.println("2. Palindrome Class");
            System.out.println("3. Words Class ");
            System.out.println("4. Consonants Class ");
            System.out.println("5. LastLetterCount Class ");
            System.out.print("Anything else, Exit.\n=>");
            str = scanner.nextLine();

            switch (str){
                case "1": obj1.vowelCount();
                    break;
                case  "2": obj2.isPalindrome();
                    break;
                case  "3": obj3.countWords();
                    break;
                case "4": obj4.countConsonants();
                    break;
                case "5": obj5.LastLetterCount();
                    break;
                default: System.out.print("Not valid option. ");
            }

        }while(str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5"));
        System.out.print("Exiting...");

    }
}
