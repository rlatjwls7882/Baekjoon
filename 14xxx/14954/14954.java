import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		int next=N;
		
		// N이 행복한 수인지 확인
		while(next!=4&&next!=1) {
			int tmp=0;
			while(next!=0) {
				tmp += Math.pow(next%10, 2);
				next/=10;
			}
			next=tmp;
		}
		
		bw.write(next==1?"HAPPY":"UNHAPPY");

		bw.close();
	} // end of main
} // end of Main class