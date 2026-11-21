import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int y = Integer.valueOf(br.readLine());
		
		int year=2018, month=4;
		while(year<y) {
			year += 2;
			month += 2;
			
			if(month>12) {
				year++;
				month-=12;
			}
		}
		
		if(year==y) {
			bw.write("yes");
		} else {
			bw.write("no");
		}
		
		bw.close();
	} // end of main()
} // end of Main class