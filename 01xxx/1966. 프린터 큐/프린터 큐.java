import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			
			// 문서의 개수 N, 궁금한 문서의 번호 M
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			
			// 문서의 중요도와 궁금한 문서의 번호 입력
			st = new StringTokenizer(br.readLine());
			LinkedList<int[]> queue = new LinkedList<>();
			for(int i=0;i<N;i++)
				queue.add(new int[] {Integer.valueOf(st.nextToken()), i});
			
			// 문서 처리
			int cnt=1;
			while(!queue.isEmpty()) {

				// 제일 중요한 문서 확인
				int max=1, idx=0;
				for(int i=0;i<queue.size();i++)
					if(max<queue.get(i)[0]) {
						max=queue.get(i)[0];
						idx=i;
					}

				// 제일 중요한 문서 전까지 뒤로 보내기
				for(int i=0;i<idx;i++)
					queue.add(queue.poll());

				// 궁금한 문서인지 확인
				if(queue.get(0)[1]==M) {
					bw.write(cnt+"\n");
					break;
				} else {
					queue.poll();
					cnt++;
				}
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class