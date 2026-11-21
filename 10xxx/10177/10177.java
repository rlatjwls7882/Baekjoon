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
		
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			int m = Integer.valueOf(br.readLine());
			
			int[][] square = new int[m][m];
			for(int i=0;i<m;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<m;j++) {
					square[i][j] = Integer.valueOf(st.nextToken());
				}
			}
			
			if(check(square)) {
				bw.write("Magic square of size "+m+"\n");
			} else {
				bw.write("Not a magic square\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean check(int[][] square) {
		int length = square.length;
		int sum=0;
		for(int i=0;i<length;i++) {
			sum += square[0][i];
		}
		
		for(int i=0;i<length;i++) {
			int sum1=0, sum2=0;
			for(int j=0;j<length;j++) {
				sum1 += square[i][j];
				sum2 += square[j][i];
			}
			if(sum!=sum1||sum!=sum2) {
				return false;
			}
		}
		
		int sumCross1=0, sumCross2=0;
		for(int i=0;i<length;i++) {
			sumCross1 += square[i][i];
			sumCross2 += square[length-i-1][i];
		}
		if(sum!=sumCross1||sum!=sumCross2) {
			return false;
		}
		
		return true;
	} // end of check()
} // end of Main class