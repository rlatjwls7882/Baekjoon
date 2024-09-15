import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(bf.readLine());
		int min=-1;
		
		for(int i=0;i<N;i++) {
			StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine());
			
			int a=Integer.valueOf(stringTokenizer.nextToken());
			int b=Integer.valueOf(stringTokenizer.nextToken());
			
			if(a<b&&(b<min||min==-1)) min=b;
		}
		System.out.println(min);
	}
}