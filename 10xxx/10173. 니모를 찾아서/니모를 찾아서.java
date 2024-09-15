import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while(true) {
			String string = br.readLine();
			if(string.equals("EOI")) break;
			
			// 문장속에 니모가 있는지 확인
			if(string.toLowerCase().indexOf("nemo")!=-1)
				bw.write("Found\n");
			else
				bw.write("Missing\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class