package J_5;
import java.util.*;
public class T_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		scan.close();
		int count=0;
		int [][]num=new int[n+1][m+1];
		for(int i=0;i<n+1;i++){
			for(int j=0;j<m+1;j++){
				num[i][j]=1;
			}
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				Q(num,i,j);
			}
		}
		for(int i=1;i<n+1;i++){
			for(int j=1;j<m+1;j++){
				if(num[i][j]==-1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void Q(int[][]num,int x,int y){
		for(int i=1;i<num.length;i++){
			for(int j=1;j<num[x].length;j++){
				/*if(x*i<num.length){
					num[x*i-1][y-1]=-num[x*i-1][y-1];
				}
				if(y*i<num[x].length){
					num[x-1][y*i-1]=-num[x-1][y*i-1];
				}*/
				if(x*i < num.length && y*j <num[x].length){
					num[x*i][y*j] = -num[x*i][y*j]; 
				}
				/*if(x*i > num.length && y*i >num[x].length){
					break;
				}*/
			}
		}
		return;
	}

}
