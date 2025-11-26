import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		int a = Integer.valueOf(br.readLine());
		if(a%4<2) System.out.print("goose");
		else System.out.print("duck");
		
        bw.close();
    } // end of main
} // end of Main