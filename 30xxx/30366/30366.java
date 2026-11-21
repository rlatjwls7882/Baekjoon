import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 그룹 수 N, 롤러코스터의 정원 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// N개의 그룹이 롤러코스터를 타는 시간 계산
		st = new StringTokenizer(br.readLine());
		Queue<Integer> line = new LinkedList<Integer>();
		while(N-->0) line.add(Integer.valueOf(st.nextToken()));
		
		int sum=0;
		for(int time=0;!line.isEmpty();) {
			if(line.peek()+sum<=M) {
				sum += line.poll();
				bw.write(time+"\n");
			} else {
				sum=0;
				time++;
			}
		}

		bw.close();
	} // end of main
} // end of Main class