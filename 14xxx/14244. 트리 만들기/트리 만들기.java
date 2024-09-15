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
		
		// 노드의 수 n, 리프의 수 m
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		
		// 트리의 간선 정보 출력
		bw.write("0 1\n1 2\n");
		
		for(int i=3;i<n;i++) {
			if(m-->2) {
				bw.write(i+" 1\n");
			} else {
				bw.write((i-1)+" "+i+"\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class