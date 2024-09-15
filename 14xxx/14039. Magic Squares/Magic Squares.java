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
		
		int[][] square = new int[4][4];
		for(int i=0;i<4;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<4;j++) {
				square[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		
		boolean chk=true;
		int sum = square[0][0]+square[0][1]+square[0][2]+square[0][3];
		for(int i=0;i<4;i++) {
			int sum1=0;
			for(int j=0;j<4;j++) {
				sum1 += square[i][j];
			}
			
			int sum2=0;
			for(int j=0;j<4;j++) {
				sum2 += square[j][i];
			}
			
			if(sum1!=sum||sum2!=sum) {
				chk=false;
				break;
			}
		}
		bw.write(chk?"magic":"not magic");
		
		bw.close();
	} // end of main()
} // end of Main class