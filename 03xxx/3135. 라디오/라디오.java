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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(br.readLine());
		
		// A->B로 갈 때 눌러야 하는 버튼수의 최솟값 계산
		boolean pushButton = false;
		while(N-->0) {
			int pos = Integer.valueOf(br.readLine());
			
			if(Math.abs(pos-B)<Math.abs(A-B)) {
				pushButton=true;
				A = pos;
			}
		}
		
        // 출력
		if(pushButton) {
			bw.write(Integer.toString(Math.abs(A-B)+1));
		} else {
			bw.write(Integer.toString(Math.abs(A-B)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class