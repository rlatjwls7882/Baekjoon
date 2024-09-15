import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		// 미래에서 사용하는 진법 A, 현재 사용하는 진법 B
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		// m자리의 A진법의 수 10진법으로 변환
		int m = Integer.valueOf(br.readLine())-1;
		st = new StringTokenizer(br.readLine());
		int decimal_num=0;
		
		for(;m>=0;m--) {
			decimal_num += Integer.valueOf(st.nextToken()) * Math.pow(A, m);
		}
		
		// B진법으로 변환하여 출력
		ArrayList<Integer> B_num = new ArrayList<>();
		while(decimal_num!=0) {
			B_num.add(decimal_num%B);
			decimal_num /= B;
		}
		
		for(int i=B_num.size()-1;i>=0;i--) {
			bw.write(Integer.toString(B_num.get(i)));
			bw.write(' ');
		}
		
		bw.close();
	} // end of main()
} // end of Main class