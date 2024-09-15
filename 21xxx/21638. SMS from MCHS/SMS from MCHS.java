import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int t1 = Integer.valueOf(st.nextToken());
		int v1 = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int t2 = Integer.valueOf(st.nextToken());
		int v2 = Integer.valueOf(st.nextToken());
		
		if(t2<0&&v2>=10)
			bw.write("A storm warning for tomorrow! Be careful and stay home if possible!");
		
		else if(t2<t1)
			bw.write("MCHS warns! Low temperature is expected tomorrow.");
		
		else if(v2>v1)
			bw.write("MCHS warns! Strong wind is expected tomorrow.");
		
		else
			bw.write("No message");
		
		bw.close();
	} // end of main
} // end of main class