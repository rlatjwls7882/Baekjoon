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
		
		// 폭 W, 파티션의 개수 P
		StringTokenizer st = new StringTokenizer(br.readLine());
		int W = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());
		
		// 미팅방의 파티션 입력
		st = new StringTokenizer(br.readLine());
		int[] partition = new int[P+2];
		partition[P+1]=W;
		
		for(int i=1;i<P+1;i++) {
			partition[i] = Integer.valueOf(st.nextToken());
		}
		
		// 구성가능한 모든 미팅방의 크기 계산
		boolean[] possible = new boolean[W+1];
		for(int i=0;i<P+2;i++) {
			for(int j=i+1;j<P+2;j++) {
				possible[partition[j]-partition[i]]=true;
			}
		}
		
		for(int i=1;i<=W;i++) {
			if(possible[i]) {
				bw.write(Integer.toString(i));
				bw.write(' ');
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class