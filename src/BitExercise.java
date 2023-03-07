public class BitExercise {
    public static void main(String[] args) {
        int a = 1>>2;   //00000000 00000000 00000000 00000000"01"
        int b = -1>>2;
        int c = 1<<2;
        int d = -1<<2;
        int e = 1>>>2;
        int f = -1>>>2;
        System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n");
        //乱码了最后一个，没学过位运算
        //就是左右移动，不过要转换为补码形式
    }
}
