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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 하루동안 할 수 있는 일의 양 계산
		int work=0, fatigue=0;
		for(int hour=1;hour<=24;hour++) {
			if(fatigue+A<=M) {
				fatigue+=A;
				work+=B;
			}
			else fatigue-=C;
			if(fatigue<0) fatigue=0;
		}
		
		bw.write(work+"");
		
		bw.close();
	} // end of main
} // end of Main class