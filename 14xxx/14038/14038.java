import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt=0;
		
		for(int i=0;i<6;i++)
			if(bf.readLine().equals("W"))
				cnt++;
		
		if(cnt>=5) System.out.println("1");
		else if(cnt>=3) System.out.println("2");
		else if(cnt>=1) System.out.println("3");
		else System.out.println("-1");
	}
}