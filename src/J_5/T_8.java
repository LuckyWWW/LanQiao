package J_5;
import java.util.*;
public class T_8 {
	static int count=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();//人数
		int []p=new int[n];//每个人手中的糖
		//老师补发的个数
		for(int i=0;i<n;i++)
			p[i]=scan.nextInt();
		scan.close();
		sort(p,n);
	}
	public static void sort(int[]p,int n){
		int []r=new int[n];
		while(true){
			if(bool(p,n)){
				System.out.println(count);
				break;
			}
			for(int i=0;i<n;i++){
				r[i]=p[i]/2;
				p[i]=p[i]/2;
			}
			for(int i=0;i<n;i++){
				if(i==0){
					p[i]=p[i]+r[n-1];
				}else
					p[i]=p[i]+r[i-1];
			}
			for(int i=0;i<n;i++){
				if(p[i]%2!=0){
					count++;
					p[i]++;
				}
			}
		}
	}
	public static boolean bool(int[]p,int n){
		int m=p[0];
		for(int i=0;i<n;i++)
			if(m!=p[i])
				return false;
		return true;
	}
}
