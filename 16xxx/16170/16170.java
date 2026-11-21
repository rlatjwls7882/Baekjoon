import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
	public static void main(String[] args) {
				
		Date today = new Date();
		
		System.out.println(new SimpleDateFormat("yyyy").format(today));
		System.out.println(new SimpleDateFormat("MM").format(today));
		System.out.println(new SimpleDateFormat("dd").format(today));
	}
}