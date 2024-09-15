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
		
		for(int i=0;i<N;i++) {
			
			if(i%2!=0) // 2줄마다 한번씩 공백 출력
				bw.write(" ");
			
			
			for(int j=0;j<N;j++) {
				bw.write("*");
				
				if(j!=N-1) // 별 사이에 공백 출력
					bw.write(" ");
			}
			
			bw.write("\n");
		} // end of for i
		
		bw.close();
	} // end of main
} // end of main class