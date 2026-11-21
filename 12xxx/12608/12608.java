import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		String[] key = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		int N = Integer.valueOf(br.readLine());
		for(int i=1;i<=N;i++) {
			String string = br.readLine();
			
			bw.write(String.format("Case #%d: ", i));
			int lastNum=-1;
			for(int j=0;j<string.length();j++) {
				for(int k=0;k<10;k++) {
					if(key[k].indexOf(string.charAt(j))!=-1) {
						if(lastNum==k) {
							bw.write(' ');
						}
						lastNum=k;
						
						int idx = key[k].indexOf(string.charAt(j));
						while(idx-->=0) {
							bw.write(Integer.toString(k));
						}
					}
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class