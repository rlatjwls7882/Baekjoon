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
		
		String name[] = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};
		
		// 동아리원의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 관리자로 선발되는 후보가 소속한 동아리 확인
		int max=0;
		String group="";
		
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int groupMax=0;
			for(int j=0;j<N;j++) {
				groupMax = Math.max(groupMax, Integer.valueOf(st.nextToken()));
			}
			
			if(max<groupMax) {
				max=groupMax;
				group = name[i];
			}
		}
		
		bw.write(group);
		
		bw.close();
	} // end of main()
} // end of Main class