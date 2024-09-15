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
		
		// 뒤집을 방향 W, 배열의 크기 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		char W = st.nextToken().charAt(0);
		int N = Integer.valueOf(st.nextToken());
		
		// 배열 입력
		int[][] arr = new int[N][N];
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		// 배열 뒤집기
		if(W=='L'||W=='R') {
			for(int i=0;i<N;i++) {
				for(int j=N-1;j>=0;j--) {
					if(arr[i][j]==1) {
						bw.write("1 ");
					} else if(arr[i][j]==2) {
						bw.write("5 ");
					} else if(arr[i][j]==5) {
						bw.write("2 ");
					} else if(arr[i][j]==8) {
						bw.write("8 ");
					} else {
						bw.write("? ");
					}
				}
				bw.newLine();
			}
		} else {
			for(int i=N-1;i>=0;i--) {
				for(int j=0;j<N;j++) {
					if(arr[i][j]==1) {
						bw.write("1 ");
					} else if(arr[i][j]==2) {
						bw.write("5 ");
					} else if(arr[i][j]==5) {
						bw.write("2 ");
					} else if(arr[i][j]==8) {
						bw.write("8 ");
					} else {
						bw.write("? ");
					}
				}
				bw.newLine();
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class