import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			String string = br.readLine();
			if(string.equals("#")) {
				break;
			}
			StringTokenizer st = new StringTokenizer(string);
			
			int Cheryl=0, Tania=0;
			while(true) {
				string = st.nextToken();
				if(string.equals("*")) {
					break;
				}
				if(string.equals("A")||Integer.valueOf(string)%2==1) {
					Cheryl++;
				} else {
					Tania++;
				}
			}
			
			if(Cheryl>Tania) {
				bw.write("Cheryl\n");
			} else if(Cheryl==Tania) {
				bw.write("Draw\n");
			} else {
				bw.write("Tania\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class