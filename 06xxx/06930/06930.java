import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int x = Integer.valueOf(br.readLine());
		int m = Integer.valueOf(br.readLine());
		
		boolean chk=false;
		for(int n=1;n<m;n++) {
			if(x*n%m==1) {
				bw.write(Integer.toString(n));
				chk=true;
				break;
			}
		}
		if(!chk) {
			bw.write("No such integer exists.");
		}
		
		bw.close();
	} // end of main()
} // end of Main class