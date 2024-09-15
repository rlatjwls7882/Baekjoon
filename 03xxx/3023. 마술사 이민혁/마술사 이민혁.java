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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 카드의 왼쪽 위부분 입력
		char[][] card = new char[R*2][C*2];
		
		for(int i=0;i<R;i++) {
			String string = br.readLine();
			for(int j=0;j<C;j++) {
				card[i][j] = string.charAt(j);
			}
		}
		
		// 카드의 나머지 부분 생성
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				card[i][2*C-1-j] = card[i][j]; // 오른쪽 위
				card[2*R-1-i][j] = card[i][j]; // 왼쪽 아래
				card[2*R-1-i][2*C-1-j] = card[i][j]; // 오른쪽 아래
			}
		}
		
		// 한개의 에러 생성
		st = new StringTokenizer(br.readLine());
		int a = Integer.valueOf(st.nextToken())-1;
		int b = Integer.valueOf(st.nextToken())-1;
		
		if(card[a][b]=='#') {
			card[a][b]='.';
		} else {
			card[a][b]='#';
		}
		
		// 카드 출력
		for(int i=0;i<2*R;i++) {
			for(int j=0;j<2*C;j++) {
				bw.write(card[i][j]);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class