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
		
		// K1 O1 K2 O2 K3 형식으로 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K1 = Integer.valueOf(st.nextToken());
		char O1 = st.nextToken().charAt(0);
		int K2 = Integer.valueOf(st.nextToken());
		char O2 = st.nextToken().charAt(0);
		int K3 = Integer.valueOf(st.nextToken());
		
		// 연산 결과가 작은 것부터 출력
		int case1 = calculation(calculation(K1, O1, K2), O2, K3);
		int case2 = calculation(K1, O1, calculation(K2, O2, K3));
		
		if(case1<case2)
			bw.write(case1+"\n"+case2);
		else
			bw.write(case2+"\n"+case1);

		bw.close();
	} // end of main()
	
	public static int calculation(int K1, char opt, int K2) {
		
		if(opt=='+')
			K1 += K2;
		else if(opt=='-')
			K1 -= K2;
		else if(opt=='*')
			K1 *= K2;
		else
			K1 /= K2;
		
		return K1;
	}
	
} // end of Main class