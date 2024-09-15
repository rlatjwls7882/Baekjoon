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
		
		// X, Y 입력
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		
		// 선두가 꼴찌를 추월하게 되는 바퀴 수 출력
		bw.write((int)Math.ceil(X/(double)(Y-X))+1+"");
		
		bw.close();
	} // end of main()
} // end of Main class