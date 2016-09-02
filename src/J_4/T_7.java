package J_4;
import java.util.*;
public class T_7 {
    // ���������
    // ������������һ��100ʱ��hash[100]��ֵΪ1��������ʱhash[100]��ֵΪ2
    static int hash[] = new int[100001];
    public static void main(String[] args) {
        // ����װ�ؿ���̨��������
        Scanner cin = new Scanner(System.in);
        // �洢���������
        int N = cin.nextInt();
        int min = 100001, max = -1;
        int m = 0, n = 0;
        // �洢һ���������̨������
        String strLine = cin.nextLine();
        // �����ݼ���ȡÿһ������
        while (N-- != 0) {
            // �洢��һ������
            strLine = cin.nextLine();
            // ��һ���ı�����Ϊ������
            Scanner s = new Scanner(strLine);
            // ����һ�е�ÿһ������
            while (s.hasNextInt()) {
                int t = s.nextInt();
                // ���ֵ����Сֵ�Ƚϣ������ҳ����е������Сֵ���޶�ѭ����Χ
                min = Math.min(t, min);
                max = Math.max(t, max);
                // ����ʵ�ּ������ܣ���t����1��ʱ��hash[t]=1
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