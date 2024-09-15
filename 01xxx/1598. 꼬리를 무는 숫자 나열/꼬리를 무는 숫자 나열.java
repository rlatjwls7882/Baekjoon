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
		
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		int x1 = A/4; if(A%4==0) x1--;
		int x2 = B/4; if(B%4==0) x2--;
		int y1 = A%4; if(y1==0) y1=4;
		int y2 = B%4; if(y2==0) y2=4;

		int x = Math.abs(x1-x2);
		int y = Math.abs(y1-y2);
		
		bw.write(x+y+"");
		bw.close();
	} // end of main
} // end of main class