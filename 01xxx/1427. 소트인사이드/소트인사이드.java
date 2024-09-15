import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] N = br.readLine().toCharArray();
		
		// 자리수를 내림차순으로 출력
		Arrays.sort(N);
		for(int i=N.length-1;i>=0;i--)
			bw.write(N[i]);
		
		bw.close();
	} // end of main
} // end of Main class