import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {

		// 8명의 플레이어 순위대로 정렬
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(int i=0;i<8;i++) {
			pq.add(br.readLine());
		}
		
		// 점수 계산
		int red=0, blue=0;
		int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
		for(int i=0;i<8;i++) {
			if(pq.poll().charAt(9)=='B') {
				blue+=score[i];
			} else {
				red+=score[i];
			}
		}
		
		// 이긴팀 확인
		if(blue>red) {
			bw.write("Blue");
		} else {
			bw.write("Red");
		}
		
		bw.close();
	} // end of main()
} // end of Main class