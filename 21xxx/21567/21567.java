import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long A = Long.valueOf(br.readLine());
		long B = Long.valueOf(br.readLine());
		long C = Long.valueOf(br.readLine());
		
		// A*B*C의 결과에 등장한 숫자의 개수 계산
		String num = Long.toString(A*B*C);
		int[] composition = new int[10];
		
		for(int i=0;i<num.length();i++)
			composition[num.charAt(i)-'0']++;
		
		for(int val:composition)
			bw.write(val+"\n");
		
		
		bw.close();
	} // end of main()
} // end of Main class