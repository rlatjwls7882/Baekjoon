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
		
		// 광야의 크기 N*M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 아리의 위치 (Ax, Ay), 아리의 진행방향 D
		st = new StringTokenizer(br.readLine());
		int Ay = 1;
		int Ax = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		
		// 부하 몬스터의 위치 (Ex, Ey)
		st = new StringTokenizer(br.readLine());
		int Ey = Integer.valueOf(st.nextToken());
		int Ex = Integer.valueOf(st.nextToken());
		
		// 아리가 부하 몬스터를 만나지 않고 포탈로 바로 갈 수 있는지 확인
		boolean meet = false;
		
		while(Ay!=N||Ax!=M) {
			if(Ax==Ex&&Ay==Ey) {
				meet=true;
				break;
			} else if(D==0&&Ax==1) {
				D=1;
				Ay++;
			} else if(D==1&&Ax==M) {
				D=0;
				Ay++;
			} else if(D==1) {
				Ax++;
			} else {
				Ax--;
			}
		}
		
		bw.write(meet?"NO...":"YES!");
		
		bw.close();
	} // end of main()
} // end of Main class