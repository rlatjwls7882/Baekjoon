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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		
		// 파스칼 삼각형으로 내부의 수의 합 계산
		int[] pascal = new int[R+W-1];
		pascal[0]=1;
		int sum=0;
		
		for(int i=0;i<R+W-1;i++) {
			int tmpVal=1;
			
			for(int j=1;j<=i;j++) {
				int lastVal = pascal[j];
				pascal[j]=pascal[j]+tmpVal;
				tmpVal = lastVal;
			}
			
			for(int j=C-1;j<=i-R+C;j++) {
				sum += pascal[j];
			}
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class