import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int H=0, V=0;
		String string = br.readLine();
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='H') {
				H++;
			} else {
				V++;
			}
		}
		
		if(H%2==1&&V%2==1) {
			bw.write("4 3\n2 1");
		} else if(H%2==1) {
			bw.write("3 4\n1 2");
		} else if(V%2==1) {
			bw.write("2 1\n4 3");
		} else {
			bw.write("1 2\n3 4");
		}
		
		bw.close();
	} // end of main()
} // end of Main class