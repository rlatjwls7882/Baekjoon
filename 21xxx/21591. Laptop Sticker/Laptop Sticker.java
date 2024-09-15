import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
		
		int wc = Integer.valueOf(stringTokenizer.nextToken());
		int hc = Integer.valueOf(stringTokenizer.nextToken());
		int ws = Integer.valueOf(stringTokenizer.nextToken());
		int hs = Integer.valueOf(stringTokenizer.nextToken());
		
		if(wc-ws>=2&&hc-hs>=2)
			System.out.println(1);
		else
			System.out.println(0);
	}
}