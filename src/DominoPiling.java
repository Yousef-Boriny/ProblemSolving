import java.util.Scanner;

public class DominoPiling {

    public int DominoOnBoard(){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int numOfDomino = (m * n)/2;
        return numOfDomino;
    }
}
