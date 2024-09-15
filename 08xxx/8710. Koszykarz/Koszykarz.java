import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		long k = Long.valueOf(st.nextToken());
		long w = Long.valueOf(st.nextToken());
		long m = Long.valueOf(st.nextToken());
		
		int num=0;
		while(k<w) {
			k+=m;
			num++;
		}
		
		System.out.println(num);
	}
}