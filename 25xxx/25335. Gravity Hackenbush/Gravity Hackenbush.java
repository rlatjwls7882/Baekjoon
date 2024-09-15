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
		
		// 점의 수 N, 선의 수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		while(N-->0) {
			br.readLine();
		}
		
		// 각 선의 색 확인
		int green=0, red=0, blue=0;
		while(M-->0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			st.nextToken();
			String color = st.nextToken();
			if(color.equals("G")) {
				green++;
			} else if(color.equals("R")) {
				red++;
			} else {
				blue++;
			}
		}
		
		// 게임 시작
		for(int i=0;;i++) {
			if(i%2==0) {
				if(green>0) {
					green--;
				} else if(red>0) {
					red--;
				} else {
					bw.write("jhnan917");
					break;
				}
			} else {
				if(green>0) {
					green--;
				} else if(blue>0) {
					blue--;
				} else {
					bw.write("jhnah917");
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class