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
		
		boolean chk=false;
		int b=1;
		for(int i=1;i<N;i++) {
			if(string.charAt(0)!=string.charAt(i)) {
				chk=true;
				b=i+1;
				break;
			}
		}
		
		if(chk) {
			bw.write("Yes\n1 "+b+" 1");
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class