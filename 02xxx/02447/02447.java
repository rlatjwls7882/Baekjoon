import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	static int N;
	static char[][] star;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 패턴의 크기 N
		N = Integer.valueOf(br.readLine());
		
		// 전부 별로 채우기
		star = new char[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				star[i][j]='*';
			}
		}
		
		// 가운데 구멍뚫기
		makeBlank(N/3);
		
		// 패턴 출력
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(star[i][j]);
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
	
	// 빈칸 뚫기
	static void makeBlank(int size) {

		for(int ROW=size;ROW<N;ROW+=size*3) {
			for(int COL=size;COL<N;COL+=size*3) {
				for(int i=ROW;i<ROW+size;i++) {
					for(int j=COL;j<COL+size;j++) {
						star[i][j]=' ';
					}
				}
			}
		}
		
		if(size>1) {
			makeBlank(size/3);
		}
		
	} // end of makeBlank()
} // end of Main class