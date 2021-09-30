public class Main {

    public static void main(String[] args) {

//        int[][] arr = {{1, 2}, {3, 4}};
//
//        for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 2; j++)
//                System.out.println("arr[" + i + "][" + j + "] = "
//                        + arr[i][j]);

//        String[][] arr = {{"W ", "W ", "W ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}, {"W ", "W ", "W ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}};
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(arr[i][j]);
//            }
//        }

       // startFire();
        startFire(1,1);

    }


    public static String startFire() {
        String[][] wildFireMap = {{"T ", "T ", "T ", "T ", "\n"}, {"T ", "T ", "T ", "T ", "\n"}, {"T ", "T ", "T ", "T ", "\n"}, {"T ", "T ", "T ", "T ", "\n"}, {"T ", "T ", "T ", "T ", "\n"}};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(wildFireMap[i][j]);
            }
        }
        return "-1";
    }

    public static String startFire(int row, int colum) {

        String[][] wildFireMap = {{"W ", "W ", "W ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}, {"W ", "W ", "W ", "W ", "\n"}, {"W ", "T ", "T ", "W ", "\n"}};


        if (wildFireMap[row][colum].equals("W ")) {
            wildFireMap[row][colum]="W ";
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    //System.out.print(wildFireMap[i][j]);
                    return wildFireMap[i][j];
                }

            }
        }

//        if (wildFireMap[row][colum].equals("T ")) {
//            wildFireMap[row][colum] = "F ";
//
//            if (wildFireMap[row-1][colum].equals("T ")){
//                wildFireMap[row-1][colum]="F ";
//            }
//            if (wildFireMap[row][colum-1].equals("T ")){
//                wildFireMap[row][colum-1]="F ";
//            }
//            if (wildFireMap[row][colum+1].equals("T ")){
//                wildFireMap[row][colum+1]="F ";
//            }
//            if (wildFireMap[row+1][colum].equals("T ")){
//                wildFireMap[row+1][colum]="F ";
//            }
//
//            if (wildFireMap[row+1][colum+1].equals("T ")){
//                wildFireMap[row+1][colum+1]="F ";
//            }

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (wildFireMap[row][colum].equals("T ")) {
                        wildFireMap[row][colum] = "F ";}
                    if ((wildFireMap[i-1][j].equals("T ")) && (i-1)>=0 &&(i-1)<5){
                        wildFireMap[i-1][j]="F ";
                    }
                    if ((wildFireMap[i][j-1].equals("T ")) && (j-1)>=0 && (j-1)<4) {
                        wildFireMap[i][j-1]="F ";
                    }
                    if ((wildFireMap[i][j+1].equals("T ")) && (j+1)>=0 && (j+1)<4){
                        wildFireMap[i][j+1]="F ";
                    }
                    if ((wildFireMap[i+1][j].equals("T ")) && (i+1)>=0 && (i+1)<5){
                        wildFireMap[i+1][j]="F ";
                    }
                    System.out.print(wildFireMap[i][j]);
                }
            }
        return "-1";
    }

        //return "-1";

}


