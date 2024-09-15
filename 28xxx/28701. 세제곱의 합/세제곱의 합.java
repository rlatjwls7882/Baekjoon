import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(bf.readLine());
		int sum1=0, sum3=0;
		
		for(int i=1;i<=N;i++) {
			sum1+=i;
			sum3+=i*i*i;			
		}
		
		bw.write(sum1+"\n"+(sum1*sum1)+"\n"+sum3);
		bw.close();
	} // end of main
} // end of main class