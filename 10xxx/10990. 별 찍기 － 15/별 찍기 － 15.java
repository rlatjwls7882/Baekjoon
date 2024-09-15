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

			bw.write("*"); //왼쪽 변 출력
			
			if(i!=1) { //첫줄이 아닐 때
				for(int j=0;j<i*2-3;j++)
					bw.write(" "); //안쪽의 빈공간
				
				bw.write("*"); //오른쪽 변 출력
			}
			
			bw.write("\n");
		} // end of for i
		
		bw.close();
	} // end of main
} // end of main class