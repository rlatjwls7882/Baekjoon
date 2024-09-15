import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String string = bf.readLine();
		
		for(int i=0;i<string.length()/10;i++) {
			String tmp = string.substring(i*10,(i+1)*10);
			
			bw.write(tmp+"\n");
		}
		int lastStart = string.length()/10*10;
		
		bw.write(string.substring(lastStart,string.length()));
		bw.close();
	} // end of main
} // end of main class