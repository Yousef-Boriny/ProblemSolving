import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelpfulMaths {

    public void XeniaSum(){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        StringBuilder returnString = new StringBuilder();
        String[] slicedString = s1.split("\\+");
        ArrayList<Integer> sortedNum = new ArrayList<>();
        for (String s: slicedString){
            sortedNum.add(Integer.parseInt(s.trim()));
        }
        Collections.sort(sortedNum);
        for (int i=0; i<sortedNum.size();i++){
            returnString.append(sortedNum.get(i));
            if (i < sortedNum.size() - 1){
                returnString.append("+");
            }
        }
        System.out.println(returnString);
    }
}
