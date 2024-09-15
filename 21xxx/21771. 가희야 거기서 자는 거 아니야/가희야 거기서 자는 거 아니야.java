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
		
		// 공간의 크기 R*C
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		st.nextToken();
		st.nextToken();
		
		// 베게의 크기 Rp*Cp
		int Rp = Integer.valueOf(st.nextToken());
		int Cp = Integer.valueOf(st.nextToken());
		
		// 베게가 차지하고 있는 칸 계산
		int P=0;
		for(int i=0;i<R;i++) {
			String string = br.readLine();
			for(int j=0;j<C;j++) {
				if(string.charAt(j)=='P') {
					P++;
				}
			}
		}
		
		// 가희가 베게 위에서 자고있는지 확인
		if(P<Rp*Cp) {
			bw.write("1");
		} else {
			bw.write("0");
		}
		
		bw.close();
	} // end of main()
} // end of Main class