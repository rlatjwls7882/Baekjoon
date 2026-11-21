import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		for(int sceneNum=1;;sceneNum++) {
			
			// 귀걸이를 압수당한 여학생
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			String[] name = new String[N];
			for(int i=0;i<N;i++) {
				name[i] = br.readLine();
			}
			
			// 귀걸이를 돌려받지 못한 여학생의 이름 출력
			HashSet<Integer> set = new HashSet<>();
			for(int j=0;j<2*N-1;j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int num = Integer.valueOf(st.nextToken());
				
				if(set.contains(num)) {
					set.remove(num);
				} else {
					set.add(num);
				}
			}
			
			bw.write(String.format("%d %s\n", sceneNum, name[set.iterator().next()-1]));
		}
		
		bw.close();
	} // end of main()
} // end of Main class