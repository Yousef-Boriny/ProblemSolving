import java.util.Scanner;

public class Team {

    public int CanWeSolveIt(){
        Scanner scanner = new Scanner(System.in);
        int NumOfProblems = scanner.nextInt(); //2
        int numberOfSolved = 0; //2

        for (int i=0;i<NumOfProblems;i++){ //1
            int Petya = scanner.nextInt();
            int Vasya  = scanner.nextInt();
            int Tonya  = scanner.nextInt();
            int[] arr = {Petya, Vasya, Tonya}; // 101
            int NumOfOnes = 0; //0
            for (int j =0; j < arr.length;j++){ //0
                if (arr[j] == 1){
                    NumOfOnes++;
                }
            }
            if (NumOfOnes >= 2){
                numberOfSolved++;
            }
        }
        return numberOfSolved;
    }
}
