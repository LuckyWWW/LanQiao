package J_4;

public class t {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n=4321;
		int m=8765;
		int a[]=new int[8];
		int i=0;
		while(n%10!=0){
			a[i]=n%10;
			n=n/10;
			i++;
		}
		while(m%10!=0){
			a[i]=m%10;
			m=m/10;
			i++;
		}
		int r=1;
		for(i=0;i<7;i++){
			for(int j=i+1;j<8;j++){
				if(a[i]==a[j]) r=0;
			}
		}
		if(r==1)
		for(i=0;i<8;i++)
			System.out.print(a[i]+" ");
	}

}

