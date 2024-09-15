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

		// 현재 호반우의 스탯 stat, 목표 스탯 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int stat = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())
            +Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(st.nextToken())*4;
		
		// 호반우가 축복을 받아야 하는 횟수 계산
		if(N<=stat) {
			bw.write("0");
		} else {
			bw.write(Integer.toString(N-stat));
		}
		
		bw.close();
	} // end of main()
} // end of Main class