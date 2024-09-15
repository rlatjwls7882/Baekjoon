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
		
		// 예매한 좌석의 정보 입력
		char[][] seat = new char[10][20];
		
		while(N-->0) {
			String string = br.readLine();
			seat[string.charAt(0)-'A'][Integer.valueOf(string.substring(1))-1]='o';
		}
		
		// 좌석 배치도 출력
		for(int i=0;i<10;i++) {
			for(int j=0;j<20;j++) {
				if(seat[i][j]=='o') {
					bw.write('o');
				} else {
					bw.write('.');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class