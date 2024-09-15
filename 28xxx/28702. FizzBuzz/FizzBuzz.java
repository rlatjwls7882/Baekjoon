import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int idx=0;
		for(int i=3;i>=0;i--) {
			String string = br.readLine();
			
			if(string.charAt(0)<='9') {
				idx=Integer.valueOf(string)+i;
				break;
			}
		}
		
		if(idx%3==0) {
			bw.write("Fizz");
		}
		if(idx%5==0) {
			bw.write("Buzz");
		}
		if(idx%3!=0&&idx%5!=0) {
			bw.write(idx+"");
		}

		bw.close();
	} // end of main()
} // end of Main class