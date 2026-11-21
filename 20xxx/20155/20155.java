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
		
		// 편의점의 개수 N, 브랜드의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 각 편의점의 브랜드 확인
		st = new StringTokenizer(br.readLine());
		int[] brand = new int[M];
		
		while(N-->0) {
			brand[Integer.valueOf(st.nextToken())-1]++;
		}
		
		// 최소 몇 명이 모여야 하는지 계산
		int cnt=0;
		for(int i=0;i<M;i++) {
			cnt = Math.max(cnt, brand[i]);
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class