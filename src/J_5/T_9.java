package J_5;
import java.util.*;
public class T_9 {
	static int count=0;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();
		int []c=new int[k];
		int [][]a=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				a[i][j]=scan.nextInt();
		int p=0;
		while(p>=0){
			
		}
	}
	public static boolean bool(int[]c,int p,int x,int [][]a){
		for(int i=0;i<c.length;i++){
			if(a[p][x]<=c[i]) return false;
		}
		return true;
	}
}
