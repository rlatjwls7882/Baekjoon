import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		// N개의 수 카운팅 정렬
		int[] sort = new int[10001];
		while(N-->0)
			sort[Integer.valueOf(br.readLine())]++;
		
		for(int i=1;i<=10000;i++)
			while(sort[i]-->0)
				bw.write(i+"\n");
		
		bw.close();
	} // end of main
} // end of Main class