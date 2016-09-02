package J_4;
import java.math.BigDecimal;
public class T_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BigDecimal one,ans;
		ans = one = BigDecimal.ONE;
		for(int i=0;i<1000;i++){
		ans=one.add(ans);
		ans=one.divide(ans,200,BigDecimal.ROUND_HALF_UP);
		//第一个参数是BigDecimal类型的值，第二个参数为保留小树位数，第三个为取舍模式：如四舍五入
		//System.out.println(ans);
		}
		System.out.println(ans.setScale(100,BigDecimal.ROUND_HALF_UP));
	}

}
