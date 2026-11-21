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
		
		for(int i=1;i<=N;i++) {
			
			for(int j=0;j<N-i;j++)
				bw.write(" ");
			
			for(int j=0;j<i;j++) {
				bw.write("*");
				
				if(j!=i-1) //마지막만 공백을 입력 안함
					bw.write(" ");
			}
			
			bw.write("\n");
		} // end of for i
		
		bw.close();
	} // end of main
} // end of main class