import java.util.Scanner;
public class Watermelon {
    public String isEven(){
        Scanner scanner = new Scanner(System.in);
        int watermelonW = scanner.nextInt();
        if (watermelonW % 2 == 0){
           return "YES";
        } else {
            return "NO";
        }
    }
}
