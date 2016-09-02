package J_4;
import java.util.Scanner;
public class T_8 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		int c[]=new int[n];
		for(int i=1;i<n;i++){
			c[i]=i;
		}
		int k=1;
		int r=2;
		while(r<=c.length){
			int t=0;
			for(int i=1;i<c.length;i++)
			if(i%r==0)c[i]=0;
			for(int i=1;i<c.length;i++)
				if(c[i]==0)t++;
			int []a=new int[c.length-t];
			int j=1;
			for(int i=1;i<c.length;i++){
				if(c[i]!=0){
					a[j]=c[i];
					j++;
				}
			}
			c=a;
			k++;
			r=c[k];
		}
			int s=0;
			for(int i=1;i<c.length;i++)
				if(c[i]>m){
					s++;
				}
			System.out.println(s);
	}

}
