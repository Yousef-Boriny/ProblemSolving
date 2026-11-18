import java.util.Scanner;

public class PetyaAndStrings {

    public int lexicographicallyOrder() {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().toLowerCase();
        String s2 = scanner.nextLine().toLowerCase();
        int s1Win = 0;
        int s2Win = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)) {
                s1Win++;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                s2Win++;
            }
        }
        if (s1Win > s2Win) {
            return 1;
        } else if (s2Win > s1Win) {
            return -1;
        } else {
            return 0;
        }
    }
}
