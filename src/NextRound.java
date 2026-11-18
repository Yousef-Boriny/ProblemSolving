import java.util.Scanner;

public class NextRound {

    public int AreYouWinning(){
        Scanner scanner = new Scanner(System.in);
        int numOfRounds = scanner.nextInt();
        int scoreToBeat = scanner.nextInt();
        int returnValue = 0;
        for (int i =0; i< numOfRounds; i++){
            int roundNumber = scanner.nextInt();
            if (roundNumber > scoreToBeat){
                returnValue++;
            }
        }
        return returnValue;
    }
}
