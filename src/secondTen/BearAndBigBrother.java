package secondTen;

import java.util.Scanner;

public class BearAndBigBrother {

    public int  YearsWeight(){
        Scanner scanner = new Scanner(System.in);
        int weightA = scanner.nextInt();
        int weightB = scanner.nextInt();
        int returnedYear = 0;
        while (weightB >= weightA){
            weightA = weightA * 3;
            weightB = weightB * 2;
            returnedYear++;
        }
        return returnedYear;
    }
}
