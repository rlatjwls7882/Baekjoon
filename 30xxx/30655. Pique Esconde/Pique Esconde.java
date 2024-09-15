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
		
		while(true) {
			
			// 어린이의 수 n, 다른 어린이를 찾고 있는 어린이 m
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.valueOf(st.nextToken());
			int m = Integer.valueOf(st.nextToken());
			
			if(n==0&&m==0) {
				break;
			}
			
			// 이미 발견된 자식
			boolean[] find = new boolean[n];
			find[m-1]=true;
			
			for(int i=0;i<n-2;i++) {
				find[Integer.valueOf(br.readLine())-1]=true;
			}
			
			// 발견되지 않은 어린이 찾기
			for(int i=0;i<n;i++) {
				if(!find[i]) {
					bw.write(Integer.toString(i+1));
					bw.newLine();
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class