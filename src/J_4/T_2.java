package J_4;

public class T_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int count=0;
		for(int a=1;a<=9;a++){
			for(int b=1;b<=9;b++){
				for(int c=1;c<=9;c++){
					for(int d=1;d<=9;d++){
						for(int e=1;e<=9;e++){
							if(a!=b&&a!=c&&a!=d&&a!=e&&b!=c&&b!=d&&b!=e&&c!=d&&c!=e&&d!=e){
								if((a*10+b)*(c*100+d*10+e)==(a*100+d*10+b)*(c*10+e))count++;
							}
						}
					}
				}
			}
		}System.out.println(count);
	}

}
