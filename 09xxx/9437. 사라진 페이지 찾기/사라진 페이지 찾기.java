import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			if(N==0) {
				break;
			}
			
			int P = Integer.valueOf(st.nextToken());
			
			// 나머지 페이지 찾기
			int[] anotherPage = new int[3];
			
			if(P%2==0) {
				anotherPage[0]=P-1;
				anotherPage[1]=N-P+1;
				anotherPage[2]=N-P+2;
			} else {
				anotherPage[0]=P+1;
				anotherPage[1]=N-P;
				anotherPage[2]=N-P+1;
			}
			Arrays.sort(anotherPage);
			
			for(int page:anotherPage) {
				bw.write(Integer.toString(page));
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class