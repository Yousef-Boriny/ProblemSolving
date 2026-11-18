package secondTen;

import java.util.Scanner;

public class WordCapitalization {

    public void capitalize(){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        char firstLetter = s1.charAt(0);
        StringBuilder stringBuilder = new StringBuilder(s1);
        stringBuilder.setCharAt(0, Character.toUpperCase(firstLetter));
        System.out.println(stringBuilder);
    }
}
