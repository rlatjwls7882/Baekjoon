import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 정렬&중복제거
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(N-->0) set.add(Integer.valueOf(st.nextToken()));
		
		for(int i=0;!set.isEmpty();i++) {
			if(i!=0) bw.write(" ");
			bw.write(set.pollFirst()+"");
		}
		
		bw.close();
	} // end of main
} // end of Main class