import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		
		int removeCnt=0;
		long maxVal=n+k-1;
		ArrayList<Long> A = new ArrayList<>();
		A.add(n+k-1L);
		for(int i=1;i<n;i++) {
			A.add(A.get(A.size()-1)-1);
			A.add(A.get(A.size()-1)-1);
			removeCnt++;
			maxVal = Math.max(maxVal, (A.size()-removeCnt)*A.get(removeCnt+(A.size()-removeCnt)/2));
		}
		bw.write(maxVal+"");
		
        bw.close();
    } // end of main
} // end of Main