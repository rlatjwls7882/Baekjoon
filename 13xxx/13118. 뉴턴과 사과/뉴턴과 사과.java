import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		long[] p = new long[4];
		
		st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<4;i++) 
			p[i] = Long.valueOf(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		long x = Long.valueOf(st.nextToken());
		
		int num=0;
		
		for(int i=0;i<4;i++)
			if(x==p[i])
				num=i+1;
		
		System.out.println(num);
	}
}