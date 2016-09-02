package J_4;
import java.util.*;
public class T_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		scan.close();
		int count=0;
		int max,min;
		for(int i=0;i<n;i++){
			max=min=a[i];
			for(int j=i;j<n;j++){
				if(a[j]<min)min=a[j];
				if(a[j]>max)max=a[j];
				if((max-min)==(j-i))count++;
			}
		}
		System.out.println(count);
	}

}
