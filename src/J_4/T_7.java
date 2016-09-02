package J_4;
import java.util.*;
public class T_7 {
    // 定义计数器
    // 例如数列中有一个100时，hash[100]的值为1，有两个时hash[100]的值为2
    static int hash[] = new int[100001];
    public static void main(String[] args) {
        // 定义装载控制台的输入流
        Scanner cin = new Scanner(System.in);
        // 存储输入的行数
        int N = cin.nextInt();
        int min = 100001, max = -1;
        int m = 0, n = 0;
        // 存储一行输入控制台的数据
        String strLine = cin.nextLine();
        // 行数递减读取每一行数字
        while (N-- != 0) {
            // 存储下一行数字
            strLine = cin.nextLine();
            // 将一行文本编译为流对象
            Scanner s = new Scanner(strLine);
            // 读这一行当每一个整数
            while (s.hasNextInt()) {
                int t = s.nextInt();
                // 最大值和最小值比较，用于找出数列的最大最小值，限定循环范围
                min = Math.min(t, min);
                max = Math.max(t, max);
                // 这里实现计数功能，当t出现1次时，hash[t]=1
                hash[t]++;
            }
        }
        for (int i = min; i <= max; i++) {
            if (hash[i] == 0)
                m = i;
            if (hash[i] == 2)
                n = i;
        }
        System.out.println(m + " " + n);
    }
}