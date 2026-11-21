import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int x = Integer.valueOf(st.nextToken());
		int y = Integer.valueOf(st.nextToken());
		
		if(y>=x)
			bw.write(y-x+"");
		else
			bw.write(x+y+"");
		
		bw.close();
	} // end of main
} // end of main class