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
		int output=0;
		
		if(string.indexOf("M")!=-1)
			output++;
		if(string.indexOf("O")!=-1)
			output++;
		if(string.indexOf("B")!=-1)
			output++;
		if(string.indexOf("I")!=-1)
			output++;
		if(string.indexOf("S")!=-1)
			output++;
		
		if(output==5)
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.close();
	} // end of main
} // end of main class