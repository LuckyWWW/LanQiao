package J_5;

public class T_3_z {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s=new String();
		for(int i=0;i<106;i++)
			s=s+"abcdefghijklmnopqrs";
		System.out.println(s.length());
		prin(s);
	}
	private static void prin(String s){
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i=i+2)
			c[i]=' ';
			s="";
			for(int i=0;i<c.length;i++)
				s=s+c[i];
			String[] sp=s.split(" ");
			s="";
			for(int i=0;i<sp.length;i++)
				s=s+sp[i];
			if(s.length()==1)
				System.out.println(s);
			else 
				prin(s);
			}
}
