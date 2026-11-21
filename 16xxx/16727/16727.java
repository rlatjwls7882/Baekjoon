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
		
		int p1 = Integer.valueOf(st.nextToken());
		int s1 = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());	
		int s2 = Integer.valueOf(st.nextToken());
		int p2 = Integer.valueOf(st.nextToken());
		
		if(p1+p2>s1+s2||(p1+p2==s1+s2&&p2>s1))
			bw.write("Persepolis");
		
		else if(s1+s2>p1+p2||(p1+p2==s1+s2&&s1>p2))
			bw.write("Esteghlal");
		
		else
			bw.write("Penalty");
		
		bw.close();
	}
}