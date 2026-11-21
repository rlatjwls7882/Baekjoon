import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		int actLength = Integer.valueOf(br.readLine());
		String act = br.readLine();
		
		// 정상적으로 기술을 사용한 횟수 계산
		LinkedList<Character> LR = new LinkedList<>();
		LinkedList<Character> SK = new LinkedList<>();
		int cnt=0;
		
		for(int i=0;i<actLength;i++) {
			
			// 사전 기술
			if(act.charAt(i)=='L') {
				LR.push('L');
			} else if(act.charAt(i)=='S') {
				SK.push('S');
			}
			
			// 본 기술
			else if(act.charAt(i)=='R') {
				if(!LR.isEmpty()) {
					LR.pop();
					cnt++;
				} else {
					break;
				}
			} else if(act.charAt(i)=='K') {
				if(!SK.isEmpty()) {
					SK.pop();
					cnt++;
				} else {
					break;
				}
			}
			
			// 연계없이 사용 가능한 기술
			else {
				cnt++;
			}
		}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class