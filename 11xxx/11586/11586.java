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
		String[] strings = new String[N];
		
		for(int i=0;i<N;i++)
			strings[i] = bf.readLine();
		
		int K = Integer.valueOf(bf.readLine());
		
		if(K==1) //그대로 출력
			for(int i=0;i<N;i++)
				bw.write(strings[i]+"\n");
		
		else if(K==2) //좌우반전 출력
			for(int i=0;i<N;i++) {
				for(int j=N-1;j>=0;j--)
					bw.write(strings[i].charAt(j)+"");
				bw.write("\n");
			}
		
		else // 상하반전 출력
			for(int i=N-1;i>=0;i--)
				bw.write(strings[i]+"\n");
		
		bw.close();
	} // end of main
} // end of main class