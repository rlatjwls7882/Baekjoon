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
		
		// 행과 열의 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		
		// 원래 사료의 그림
		char[][] original = new char[C][R];
		for(int i=0;i<C;i++) {
			String string = br.readLine();
			for(int j=0;j<R;j++) {
				original[i][j] = string.charAt(j*2);
			}
		}
		
		// 반시계 방향으로 90도 돌아간 그림인지 확인
		if(isEqual(original, R, C)) {
			bw.write("|>___/|        /}\n"
					+ "| O < |       / }\n"
					+ "(==0==)------/ }\n"
					+ "| ^  _____    |\n"
					+ "|_|_/     ||__|");
		} else {
			bw.write("|>___/|     /}\n"
					+ "| O O |    / }\n"
					+ "( =0= )\"\"\"\"  \\\n"
					+ "| ^  ____    |\n"
					+ "|_|_/    ||__|");
		}
		
		bw.close();
	} // end of main()
	
	static boolean isEqual(char[][] original, int R, int C) throws IOException {
		for(int i=0;i<R;i++) {
			String string = br.readLine();
			for(int j=C-1;j>=0;j--) {
				if(original[j][i]!=string.charAt((C-j-1)*2)) {
					return false;
				}
			}
		}
		
		return true;
	} // end of isEqual()
} // end of Main class