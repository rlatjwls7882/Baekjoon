import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		String S = br.readLine();
		
		// 기다린 시간과 레버를 당긴 상태 확인
		int Wnum=0;
		boolean levered=false, leveredInB=false;
		
		for(int i=0;i<N;i++) {
			if(S.charAt(i)=='P') {
				if(Wnum==0) {
					levered=!levered;
				} else if(Wnum==1) {
					leveredInB=true;
				}
			} else {
				Wnum++;
			}
		}
		
		if(Wnum<2) { // 광차가 아직 C구역에 도착하지 않은 경우
			bw.write("0");
		} else if(leveredInB) { // 모두 깔리는 경우
			bw.write("6");
		}
		else if(levered) { // 1명이 깔리는 경우
			bw.write("1");
		} else { // 5명이 깔리는 경우
			bw.write("5");
		}
		
		bw.close();
	} // end of main()
} // end of Main class