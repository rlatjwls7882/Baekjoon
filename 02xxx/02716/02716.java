import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		// 나무 꼭대기에 도달할 수 있는 최소 원숭이의 수 계산
		while(T-->0) {
			String string = br.readLine();
			int maxDepth=0, curDepth=0;
			
			for(int i=0;i<string.length();i++) {
				if(string.charAt(i)=='[') {
					curDepth++;
				} else {
					curDepth--;
				}
				maxDepth = Math.max(maxDepth, curDepth);
			}
			
			// 출력
			bw.write(Long.toString((long)Math.pow(2, maxDepth)));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class