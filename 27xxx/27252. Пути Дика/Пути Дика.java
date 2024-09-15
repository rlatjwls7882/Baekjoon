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
		
		int curH=0;
		int[] h = new int[string.length()];
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='(') {
				if(i==0) {
					h[i]=1;
				} else if(string.charAt(i-1)==')') {
					h[i]=h[i-1];
				} else {
					h[i]=h[i-1]+1;
				}
				curH = Math.max(curH, h[i]);
			} else {
				if(string.charAt(i-1)=='(') {
					h[i]=h[i-1];
				} else {
					h[i]=h[i-1]-1;
				}
			}
		}	
		
		while(curH>0) {
			for(int i=0;i<string.length();i++) {
				if(h[i]==curH) {
					if(string.charAt(i)=='(') {
						bw.write('/');
					} else {
						bw.write('\\');
					}
				} else {
					bw.write('.');
				}
			}
			bw.newLine();
			curH--;
		}
		
		bw.close();
	} // end of main()
} // end of Main class