package J_4;
import java.math.BigDecimal;
public class T_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BigDecimal one,ans;
		ans=one=BigDecimal.ONE;
		for(int i=0;i<1000;i++){
			ans=one.add(ans);
			ans = one.divide(ans, 200, BigDecimal.ROUND_HALF_UP);
		}
		System.out.println(ans.setScale(100, BigDecimal.ROUND_HALF_UP));
	}
}
