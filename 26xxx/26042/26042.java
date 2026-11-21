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
		
		int n = Integer.valueOf(br.readLine());
		
		// 줄서있는 최대 학생수와 마지막 학생 확인
		int maxSize=0, maxLast=0, curSize=0, curLast=0;
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int type = Integer.valueOf(st.nextToken());
			
			if(type==1) {
				curSize++;
				curLast = Integer.valueOf(st.nextToken());
				if(maxSize<curSize) {
					maxSize=curSize;
					maxLast=curLast;
				} else if(maxSize==curSize) {
					maxLast = Math.min(curLast, maxLast);
				}
			} else {
				curSize--;
			}
		}
		
		// 출력
		bw.write(maxSize+" "+maxLast);
		
		bw.close();
	} // end of main()
} // end of Main class