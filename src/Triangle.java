
public class Triangle {

    public static void main(String[] args) {
     // 代入する数値は自由に変更してください
        int a = 4;
        int b = 8;
        int c = 4;
        if (a == b && a == c && b == c) {
            System.out.println("この三角形は正三角形です");
    }else if (a == b || b == c || a == c) {
        System.out.println("この三角形は二等辺三角形です");
    } else {
        System.out.println("この三角形は不等辺三角形です");

}}}
