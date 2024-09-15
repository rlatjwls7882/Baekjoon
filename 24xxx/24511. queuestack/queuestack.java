import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		StringTokenizer A = new StringTokenizer(br.readLine());
		StringTokenizer B = new StringTokenizer(br.readLine());
		
		// deque 생성(stack일때는 변화가 없으니 queue일때만 원소 받아오기)
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for(int i=0;i<N;i++) {
			if(A.nextToken().equals("0")) {
				deque.add(Integer.valueOf(B.nextToken()));
			} else {
				B.nextToken();
			}
		}
		
		// 원소 삽입(queue에 들어있는 원소만 한칸씩 밀림)
		int M = Integer.valueOf(br.readLine());
		StringTokenizer C = new StringTokenizer(br.readLine());
		
		for(int i=0;i<M;i++) {
			deque.addFirst(Integer.valueOf(C.nextToken()));
			bw.write(deque.pollLast()+" ");
		}
		
		bw.close();
	} // end of main
} // end of Main class