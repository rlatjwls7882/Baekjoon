import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x = Integer.valueOf(bf.readLine());
		int y = Integer.valueOf(bf.readLine());
		int z = Integer.valueOf(bf.readLine());
			
		if(x+y<=z)
			bw.write("1");
		else
			bw.write("0");
		
		bw.close();
	} // end of main
} // end of main class