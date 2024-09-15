import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 현재 서있는 순서
		int N = Integer.valueOf(br.readLine());
		Queue<Integer> line = new LinkedList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++)
			line.add(Integer.valueOf(st.nextToken()));
		
		// 모두 순서대로 간식을 받을 수 있는지 확인
		Stack<Integer> alley = new Stack<Integer>();

		boolean Nice=true;
		for(int i=1;i<=N;i++) { // 앞에 서있는 사람들 골목길로 넣고 빠져나가기
			if(line.contains(i)) {
				while(line.peek()!=i)
					alley.add(line.poll());
				line.poll();
			} else if(alley.peek()==i) { // 골목길에서 빠져나올 수 있는 경우
				alley.pop();
			} else { // 골목길에서 빠져나올 수 없는 경우
				Nice=false;
				break;
			}
		}

		bw.write(Nice?"Nice":"Sad");
		
		bw.close();
	} // end of main
} // end of Main class