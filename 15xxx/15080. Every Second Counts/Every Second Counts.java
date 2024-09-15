import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int h1 = Integer.valueOf(st.nextToken(" : "));
		int m1 = Integer.valueOf(st.nextToken(" : "));
		int s1 = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int h2 = Integer.valueOf(st.nextToken(" : "));
		int m2 = Integer.valueOf(st.nextToken(" : "));
		int s2 = Integer.valueOf(st.nextToken());
		
		int output = (h2-h1)*3600+(m2-m1)*60+(s2-s1);
		if(output<0) output+=60*60*24;
		
		System.out.println(output);
	}
}