import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.valueOf(st.nextToken())*1000;
		int k = Integer.valueOf(st.nextToken())*1000;
		
		if(x>=k*7) //k, 2k, 4k
			System.out.println(k*7);
		else if(x>=k*3.5) //(1/2)k, k, 2k
			System.out.println((int)(k*3.5));
		else if(x>=k*1.75) //(1/4)k, (1/2)k, k
			System.out.println((int)(k*1.75));
		else //못만들때
			System.out.println(0);
	}
}