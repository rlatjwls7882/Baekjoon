import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		
		int a = 100-x;
		int b = 100-y;
		int c = 100-(a+b);
		int d = a*b;
		int e = d/100;
		int f = d%100;
		
		System.out.printf("%d %d %d %d %d %d%n",a,b,c,d,e,f);
		System.out.printf("%d %d",e+c,f);
	}
}