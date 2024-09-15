import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		char[][] nums = new char[4][4];
		
		for(int i=0;i<4;i++) {
			int tmp = string.charAt(i)-'0';
			for(int j=3;j>=0;j--) {
				if(tmp%2==1) {
					nums[i][j]='*';
				} else {
					nums[i][j]='.';
				}
				tmp/=2;
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				bw.write(nums[j][i]);
				if(j==1) {
					bw.write("   ");
				} else if(j<3) {
					bw.write(' ');
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class