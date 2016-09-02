package J_5;

public class T_6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num=0;
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				if(a!=b){
					for(int c=1;c<=9;c++){
						for(int d=1;d<=9;d++){
							if(c!=d){
								double sum1=(double)(a*10+c)/(b*10+d);
								double sum2=(double)(a*c)/(b*d);
								if(sum1==sum2){
									System.out.println(a+"/"+b+"*"+c+"/"+d);
									num++;
								}
							}
						}
					}
				}
			}
		}System.out.print(num);
	}

}
