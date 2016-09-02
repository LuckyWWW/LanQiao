package J_5;

public class T_3
{
	static int p=0;
	public static void main(String[] args)
	{
		String string="";
		for(int i=0;i<106;i++)
			string+="abcdefghijklmnopqrs";
		System.out.println("字符串长度："+string.length());
		print(string);
	}
	private static void print(String string)
	{
		p++;
		//将字符串变为字符数组以便将奇数位的字母用' '替换
		char[] s=string.toCharArray();
		for(int i=0;i<s.length;i+=2)
			s[i]=' ';
		//将用' '替换后字符数组变为字符串
		string="";
		for(int i=0;i<s.length;i++)
			string+=s[i];
		//得到去掉奇数位后的新串数组
		String[] splitStrings=string.split(" ");
		string="";
		for(int i=0;i<splitStrings.length;i++)
			string+=splitStrings[i];
		//如果只有一个就打印
		if(string.length()==1)
			System.out.println("结果："+string+"次数："+p);
		else			
			print(string);
	}
}
