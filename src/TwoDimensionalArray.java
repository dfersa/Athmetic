public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1,2},{1,2}};
        for(int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(array[i][j] + "\n");
            }
        }
    }
}