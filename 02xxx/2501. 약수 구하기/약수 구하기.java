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

		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) K--;
			
			if(K==0) {
				bw.write(i+"");
				break;
			}
		}
		
		if(K!=0) bw.write("0"); //약수의 개수가 K보다 작을때
		
		bw.close();
	} // end of main
} // end of main class