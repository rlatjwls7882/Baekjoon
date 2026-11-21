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

		for(int i=1;;i++) {
			
			// 적정 체중 o, 실제 체중 w
			StringTokenizer st = new StringTokenizer(br.readLine());
			int o = Integer.valueOf(st.nextToken());
			int w = Integer.valueOf(st.nextToken());
			if(o==0&&w==0) break;
			
			// 현재 펫의 상태 (0: 행복, 1: 슬픔, 2: 사망)
			int state=0;
			
			// 시나리오 시작
			while(true) {
				
				// 가하는 작용과 수치
				st = new StringTokenizer(br.readLine());
				char interaction = st.nextToken().charAt(0);
				int n = Integer.valueOf(st.nextToken());
				
				// 작용 수행
				if(interaction=='F') w+=n;
				else if(interaction=='E') w-=n;
				else break;
				
				// 상태
				if(state!=2) {
					if(o*0.5<w&&w<o*2) state=0;
					else if(w<=0) state=2;
					else state=1;
				}
			}
			
			// 최종 상태
			if(state==0) bw.write(i+" :-)\n");
			else if(state==1) bw.write(i+" :-(\n");
			else bw.write(i+" RIP\n");
		}

		bw.close();
	} // end of main
} // end of Main class