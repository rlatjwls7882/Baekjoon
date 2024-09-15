import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = bf.readLine().trim();
		
		string = string.replace("a", "4").replace("e", "3")
		.replace("i", "1").replace("o", "0").replace("s", "5");
		
		bw.write(string+"");
		bw.close();
	} // end of main
} // end of main class