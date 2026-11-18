import java.util.Scanner;

public class WayTooLongWords {

    public void makeShortWords(){
        Scanner scanner = new Scanner(System.in);
        int numOfWords = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i< numOfWords; i++){
            String word = scanner.nextLine();
            if (word.length() <= 10){
                System.out.println(word);
            } else {
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1));
            }
        }
    }
}