import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		int[][] word = new int[30][26];
		int[] max = new int[30];
		
		while(N-->0) {
			String string = br.readLine();
			for(int i=0;i<string.length();i++) {
				max[i] = Math.max(max[i], ++word[i][string.charAt(i)-'a']);
			}
		}
		
		for(int i=0;i<30;i++) {
			if(max[i]==0) {
				break;
			}
			
			bw.write((i+1)+":");
			for(int j=0;j<26;j++) {
				if(max[i]==word[i][j]) {
					bw.write(" "+(char)(j+'a'));
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class