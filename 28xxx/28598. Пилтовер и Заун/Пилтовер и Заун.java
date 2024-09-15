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
		int x1 = Integer.valueOf(st.nextToken());
		int x2 = Integer.valueOf(st.nextToken());
		int n = Integer.valueOf(st.nextToken());
		
		// 둘이 한 점에 있었는지 확인
		boolean oneSpot=false;
		
		if((x1-x2)%2==0&&(x1-x2)/2>=n) {
			oneSpot=true;
		}
		
		bw.write(oneSpot?"YES":"NO");
		
		bw.close();
	} // end of main()
} // end of Main class