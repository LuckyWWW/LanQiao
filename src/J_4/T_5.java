package J_4;

public class T_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Rational a = new Rational(1,3);
		Rational b = new Rational(1,6);
		Rational c = a.add(b);
		System.out.println(a + "+" + b + "=" + c);

	}

}
class Rational
{
	private long ra;
	private long rb;
	
	private long gcd(long a, long b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public Rational(long a, long b){
		ra = a;
		rb = b;	
		long k = gcd(ra,rb);
		if(k>1){ //需要约分
			ra /= k;  
			rb /= k;
		}
	}
	// 加法
	public Rational add(Rational x){
		System.out.println(x);
		System.out.println(ra);
		System.out.println(rb);
		return new Rational(ra*x.rb+rb*x.ra,rb*x.rb);  //填空位置
	}
	// 乘法
	public Rational mul(Rational x){
		return new Rational(ra*x.ra, rb*x.rb);
	}
	public String toString(){
		if(rb==1) return "" + ra;
		return ra + "/" + rb;
	}
}