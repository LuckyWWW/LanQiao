package J_4;
import java.util.Calendar;
import java.util.Date;
public class T_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i=1999;;i++){
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(new Date(i - 1900, 11, 31));
			if(calendar.get(Calendar.DAY_OF_WEEK)-1==0){
				System.out.println(i);
				return;
			}
		}
	}

}
