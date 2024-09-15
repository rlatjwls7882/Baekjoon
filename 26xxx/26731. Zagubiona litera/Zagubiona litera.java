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
		
		for(int i=0;i<26;i++)
			if(string.indexOf(i+'A')==-1)
				bw.write(i+'A');
		
		bw.close();
	} // end of main
} // end of main class