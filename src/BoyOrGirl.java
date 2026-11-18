import java.util.Scanner;
import java.util.stream.Collectors;

public class BoyOrGirl {

   public String recognizeGenders() {
       Scanner scanner = new Scanner(System.in);
       String s1 = scanner.nextLine().toLowerCase();
       String distinct = s1.chars().distinct()
               .mapToObj(ch -> String.valueOf((char) ch)).collect(Collectors.joining());
       if (distinct.length() % 2 == 0){
           return "CHAT WITH HER!";
       } else {
           return "IGNORE HIM!";
       }
   }
}
