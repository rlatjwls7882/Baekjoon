import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		boolean chk=false;
		double average=0;
		for(int i=0;i<n;i++) {
			int tmp = Integer.valueOf(br.readLine());
			if(tmp==3) {
				chk=true;
				break;
			}
			average += tmp;
		}
		average /= n;
		
		if(chk) {
			bw.write("None");
		} else if(average==5) {
			bw.write("Named");
		} else if(average>=4.5) {
			bw.write("High");
		} else {
			bw.write("Common");
		}
		
		bw.close();
	} // end of main()
} // end of Main class