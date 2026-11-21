import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 콘텐츠의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 전체 콘텐츠의 흥미도 합 계산
		int sum=0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] interest = new int[N];
		
		for(int i=0;i<N;i++) {
			interest[i] = Integer.valueOf(st.nextToken());
			sum += interest[i];
		}
		
		bw.write(Integer.toString(sum));
		bw.newLine();
		
		// My뷰에 등록되어 있지 않은 콘텐츠의 흥미도 합 계산
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			if(st.nextToken().equals("1")) {
				sum -= interest[i];
			}
		}
		
		bw.write(Integer.toString(sum));
			
		bw.close();
	} // end of main()
} // end of Main class