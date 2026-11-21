import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			br.readLine();
			
			BigInteger res = BigInteger.ONE;
			for(int i=2;i<=N;i++) {
				res = res.multiply(new BigInteger(Integer.toString(i)));
			}
			String string = res.toString();
			
			int[] nums = new int[10];
			for(int i=0;i<string.length();i++) {
				nums[string.charAt(i)-'0']++;
			}
			
			bw.write(N+"! --\n");
			for(int i=0;i<10;i++) {
				if(i==0||i==5) {
					bw.write("   ");
				} else {
					bw.write("    ");
				}
				
				bw.write("("+i+")");
				int length = Integer.toString(nums[i]).length();
				for(int j=0;j<5-length;j++) {
					bw.write(' ');
				}
				bw.write(Integer.toString(nums[i]));
				
				if(i==4||i==9) {
					bw.newLine();
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class