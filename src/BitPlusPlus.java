import java.util.Scanner;
public class BitPlusPlus {

    public int BitValue(){
        Scanner scanner = new Scanner(System.in);
        int numOfStatments = scanner.nextInt();
        scanner.nextLine();
        int returnValue = 0;
        for (int i=0;i<numOfStatments;i++){
            String statment = scanner.nextLine();
            if (statment.equalsIgnoreCase("x++") || statment.equalsIgnoreCase("++x")){
                returnValue++;
            } else if (statment.equalsIgnoreCase("x--") || statment.equalsIgnoreCase("--x")) {
                returnValue--;
            }
        }
        return  returnValue;
    }
}
