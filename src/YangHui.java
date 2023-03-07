public class YangHui {
    public static void main(String[] args) {
        int[][] array = new int[10][];
        for(int i = 0 ; i < array.length ; i++) {
            array[i] = new int[i + 1];
            for(int j = 0 ; j < i + 1; j++) {
                if (j == 0 || j == array[i].length - 1) {
                    array[i][j] = 1;
                }
                    else
                {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < 10 ; i++ ) {
            for (int j = 0 ; j < i + 1 ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    } 
}
