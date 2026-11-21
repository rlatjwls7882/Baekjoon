import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			String string = bf.readLine();
			
			String newstring = "";
			newstring += string.toUpperCase().charAt(0);
			newstring += string.substring(1);
			
			bw.write(newstring+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class