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
		
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			br.readLine();
			
			// 박스의 크기
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			// 박스의 내용물
			char[][] box = new char[r][c];
			for(int i=0;i<r;i++) {
				box[i] = br.readLine().toCharArray();
			}
			
			// 사탕의 개수 계산
			int cnt=0;
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					if(j+2<c&&box[i][j]=='>'&&box[i][j+1]=='o'&&box[i][j+2]=='<') {
						cnt++;
					} else if(i+2<r&&box[i][j]=='v'&&box[i+1][j]=='o'&&box[i+2][j]=='^') {
						cnt++;
					}
				}
			}
			
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class