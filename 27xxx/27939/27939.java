import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static char[] color;
	
	public static void main(String[] args) throws IOException {
		
		// 가지의 품종 수 n
		int n = Integer.valueOf(br.readLine());
		
		// 각 품종의 색
		StringTokenizer st = new StringTokenizer(br.readLine());
		color = new char[n];
		for(int i=0;i<n;i++) {
			color[i] = st.nextToken().charAt(0);
		}
		
		// 조수의 수 m, 각 조수가 가진 품종의 수 k
		st = new StringTokenizer(br.readLine());
		int m = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		// 품종의 색이 흰색이 될 수 있는지 확인
		if(canWhite(m, k)) {
			bw.write('W');
		} else {
			bw.write('P');
		}
		
		bw.close();
	} // end of main()
	
	static boolean canWhite(int m, int k) throws IOException {
		for(int i=0;i<m;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int whiteNum=0;
			for(int j=0;j<k;j++) {
				if(color[Integer.valueOf(st.nextToken())-1]=='W') {
					whiteNum++;
				} else {
					break;
				}
			}
			
			if(whiteNum==k) {
				return true;
			}
		}
		
		return false;
	} // end of canWhite()
} // end of Main class