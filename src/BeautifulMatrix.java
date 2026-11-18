import java.util.Scanner;

public class BeautifulMatrix {

    public int insideMatrix(){
        Scanner scanner = new Scanner(System.in);
        int row = 0;
        int col = 0;
        int NumOfRowNeeded = 0;
        int NumOfColNeeded = 0;
        int[][] arr =  new int[5][5];
        for (int i=0; i< 5;i++){
            for (int j=0;j<5;j++){
                arr[i][j] = scanner.nextInt();
                if ( arr[i][j] == 1){
                     row = i;
                     col = j;
                }
            }
        }
        if (row < 2){
            for (int i=row; i<2;i++){
                NumOfRowNeeded++;
            }
        } if (row > 2) {
            for (int i = row; i > 2; i--) {
                NumOfRowNeeded++;
            }
        }
        if (col > 2) {
            for (int i = col; i > 2; i--) {
                NumOfColNeeded++;
            }
        }
        if (col < 2) {
            for (int i = col; i < 2; i++) {
                NumOfRowNeeded++;
            }
        }
        return NumOfRowNeeded + NumOfColNeeded;
    }
}