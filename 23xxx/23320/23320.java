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
		
		// 학생의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 상대평가시 A를 맞는 학생의 수 계산
		StringTokenizer Stu = new StringTokenizer(br.readLine());
		StringTokenizer XnY = new StringTokenizer(br.readLine());
		int X = Integer.valueOf(XnY.nextToken());
		
		bw.write(Integer.toString(N*X/100));
		bw.write(' ');
		
		// 절대평가시 A를 맞는 학생의 수 계산
		int Y = Integer.valueOf(XnY.nextToken());
		int cnt=0;
		
		while(N-->0) {
			if(Y<=Integer.valueOf(Stu.nextToken())) {
				cnt++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class