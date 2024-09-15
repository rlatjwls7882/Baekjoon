import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 돌림판 문자
		int N = Integer.valueOf(br.readLine());
		String board = br.readLine();
		
		boolean[] chars = new boolean[26];
		for(int i=0;i<N;i++) {
			chars[board.charAt(i)-'a']=true;
		}
		
		// 만들어야 하는 문자
		int M = Integer.valueOf(br.readLine());
		String S = br.readLine();
		
		// 돌림판 회전수 계산
		int cnt=0, idxBoard=N-1, idxS=0;
		while(idxS<M) {
			if(!chars[S.charAt(idxS)-'a']) {
				cnt=-1;
				break;
			}
			
			cnt++;
			idxBoard++;
			if(S.charAt(idxS%M)==board.charAt(idxBoard%N)) {
				idxS++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class