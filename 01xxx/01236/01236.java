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
		
		// 세로 크기 N, 가로 크기 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		// 경비원이 없는 열의 수 계산
		int rowNum=0;
		String[] strings = new String[N];
		for(int i=0;i<N;i++) {
			strings[i] = br.readLine();
			
			if(strings[i].indexOf('X')==-1) {
				rowNum++;
			}
		}
		
		// 경비원이 없는 행의 수 계산
		int colNum=0;
		for(int i=0;i<M;i++) {
			boolean isExist=false;
			
			for(int j=0;j<N;j++) {
				if(strings[j].charAt(i)=='X') {
					isExist=true;
					break;
				}
			}
			
			if(!isExist) {
				colNum++;
			}
		}
		
		// 추가해야 하는 경비원의 최솟값 계산
		bw.write(Integer.toString(Math.max(rowNum, colNum)));
		
		bw.close();
	} // end of main()
} // end of Main class