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
			
		// A, B 입력 (A>=B)
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		if(A<B) {
			int tmp=A;
			A=B;
			B=tmp;
		}
		
		// A, B의 최대공약수 계산
		int dupA=A, dupB=B;
		
		while(dupB!=0) {
			int tmp = dupA%dupB;
			dupA = dupB;
			dupB = tmp;
		}
		
		// A와 B의 최대공약수와 최소공배수 출력
		bw.write(dupA+"\n"+(A*B/dupA));

		bw.close();
	} // end of main
} // end of Main class