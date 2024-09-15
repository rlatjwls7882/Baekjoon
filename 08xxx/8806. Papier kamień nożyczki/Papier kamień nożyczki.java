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
		
		int Z = Integer.valueOf(br.readLine());
		
		while(Z-->0) {
			
			// 아담의 가위바위보 확률
			StringTokenizer st = new StringTokenizer(br.readLine());
			double[] XYZ1 = new double[3];
			for(int i=0;i<3;i++) {
				XYZ1[i] = Double.valueOf(st.nextToken());
			}
			
			// 고시아의 가위바위보 확률
			st = new StringTokenizer(br.readLine());
			double[] XYZ2 = new double[3];
			for(int i=0;i<3;i++) {
				XYZ2[i] = Double.valueOf(st.nextToken());
			}
			
			// 누가 이길 확률이 더 높은지 계산
			double win1 = XYZ1[0]*XYZ2[1]+XYZ1[1]*XYZ2[2]+XYZ1[2]*XYZ2[0];
			double win2 = XYZ1[0]*XYZ2[2]+XYZ1[1]*XYZ2[0]+XYZ1[2]*XYZ2[1];
			
			if(win1>win2) {
				bw.write("ADAM\n");
			} else if(win1==win2) {
				bw.write("=\n");
			} else {
				bw.write("GOSIA\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class