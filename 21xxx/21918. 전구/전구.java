import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 전구의 개수 N, 명령어의 개수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 초기 전구 상태
		boolean[] light = new boolean[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++)
			if(st.nextToken().equals("1"))
				light[i] = true;

		// M개의 명령 수행
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken())-1;
			int c = Integer.valueOf(st.nextToken());

			if(a==1) {
				if(c==1) light[b]=true;
				else light[b]=false;
			} else if(a==2) {
				for(int i=b;i<c;i++)
					light[i] = !light[i];
			} else if(a==3) {
				for(int i=b;i<c;i++)
					light[i] = false;
			} else {
				for(int i=b;i<c;i++)
					light[i] = true;
			}
		}
		
		// 명령 수행 후 전구의 상태 출력
		for(int i=0;i<N;i++) {
			if(light[i]) bw.write("1 ");
			else bw.write("0 ");
		}

		bw.close();
	} // end of main
} // end of Main class