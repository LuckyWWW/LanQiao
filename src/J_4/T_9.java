package J_4;
import java.util.*;
public class T_9 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		int left,up,down;
		int k=0;
		for(left=1;left<n;left++){
			for(down=1;down<9876;down++){
				up=(n-left)*down;
					if(cheak(left,up,down))
						k++;
			}
		}
		System.out.println(k);
	}
	static boolean cheak (int left,int up,int down){
		int []a=new int[9];
		int i=0;
		while(left%10!=0){
			a[i]=(left%10);
			left=left/10;
			i++;
		}
		while(up%10!=0){
			a[i]=(up%10);
			up=up/10;
			i++;
			if(i>8)return false;
		}
		while(down%10!=0){
			a[i]=(down%10);
			down=down/10;
			i++;
			if(i==9&&down!=0)return false;
		}
		if(i!=9)return false;
		for(i=0;i<8;i++){
			for(int j=i+1;j<9;j++){
				if(a[i]==a[j]||a[i]==0||a[j]==0||left!=0||up!=0||down!=0)return false;
			}
		}
		/*for(i=0;i<9;i++)
			System.out.print(a[i]+" ");
		System.out.println("/n"+left+" "+up+" "+down);*/
		return true;
	}

}
