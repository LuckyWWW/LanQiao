package J_5;

public class T_3
{
	static int p=0;
	public static void main(String[] args)
	{
		String string="";
		for(int i=0;i<106;i++)
			string+="abcdefghijklmnopqrs";
		System.out.println("�ַ������ȣ�"+string.length());
		print(string);
	}
	private static void print(String string)
	{
		p++;
		//���ַ�����Ϊ�ַ������Ա㽫����λ����ĸ��' '�滻
		char[] s=string.toCharArray();
		for(int i=0;i<s.length;i+=2)
			s[i]=' ';
		//����' '�滻���ַ������Ϊ�ַ���
		string="";
		for(int i=0;i<s.length;i++)
			string+=s[i];
		//�õ�ȥ������λ����´�����
		String[] splitStrings=string.split(" ");
		string="";
		for(int i=0;i<splitStrings.length;i++)
			string+=splitStrings[i];
		//���ֻ��һ���ʹ�ӡ
		if(string.length()==1)
			System.out.println("�����"+string+"������"+p);
		else			
			print(string);
	}
}
