import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		String C = st.nextToken();
		
		// A에 B를 C번 XOR한 결과 계산
		if((C.charAt(C.length()-1)-'0')%2==0)
			bw.write(A+"");
		else
			bw.write((A^B)+"");
		
		bw.close();
	} // end of main()
} // end of Main class