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
		int[] finger = new int[8];
		String[] type = {"1QAZ", "2WSX", "3EDC", "4RFV5TGB", "6YHN7UJM", "8IK,", "9OL.", "0P;/-['=]"};
		
		for(int i=0;i<string.length();i++) {
			for(int j=0;j<8;j++) {
				if(type[j].indexOf(string.charAt(i))!=-1) {
					finger[j]++;
					break;
				}
			}
		}
		
		for(int i=0;i<8;i++) {
			bw.write(finger[i]+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class