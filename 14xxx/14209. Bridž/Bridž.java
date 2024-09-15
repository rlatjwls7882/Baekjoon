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
		
		int point=0;
		while(N-->0) {
			String string = br.readLine();
			for(int i=0;i<13;i++) {
				if(string.charAt(i)=='A') {
					point+=4;
				} else if(string.charAt(i)=='K') {
					point+=3;
				} else if(string.charAt(i)=='Q') {
					point+=2;
				} else if(string.charAt(i)=='J') {
					point+=1;
				}
			}
		}
		bw.write(Integer.toString(point));

		bw.close();
	} // end of main()
} // end of Main class