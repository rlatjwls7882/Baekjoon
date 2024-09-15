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
		
		while(true) {
			
			// 세 정수 입력
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			
			if(A==0&&B==0&&C==0) break;
			
			// 세번째 숫자가 등차수열의 일부분이 될 수 있는지 확인
			if((C-A)/B>=0&&(C-A)/B==(double)(C-A)/B)
				bw.write((C-A)/B+1+"\n");
			else
				bw.write("X\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class