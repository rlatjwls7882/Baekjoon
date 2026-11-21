import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// N명의 줄서기
		LinkedList<Integer> line = new LinkedList<Integer>();
		for(int i=1;i<=N;i++)
			line.add(line.size()-Integer.valueOf(st.nextToken()), i);
	
		for(int i:line)
			bw.write(i+" ");
		
		bw.close();
	} // end of main
} // end of Main class