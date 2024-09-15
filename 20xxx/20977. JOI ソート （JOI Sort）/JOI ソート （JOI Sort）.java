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
		String string = br.readLine();
		
		int J=0, O=0, I=0;
		for(int i=0;i<N;i++) {
			if(string.charAt(i)=='J') {
				J++;
			} else if(string.charAt(i)=='O') {
				O++;
			} else {
				I++;
			}
		}
		
		while(J-->0) {
			bw.write("J");
		}
		while(O-->0) {
			bw.write("O");
		}
		while(I-->0) {
			bw.write("I");
		}
		
		bw.close();
	} // end of main()
} // end of Main class