import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] moveX = {1, 1, 1, 0, 0, -1, -1, -1};
		int[] moveY = {-1, 0, 1, -1, 1, -1, 0, 1};
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			if(N==0&&M==0) break;
			
			// 조직의 사진 입력
			String[] picture = new String[N];
			for(int i=0;i<N;i++)
				picture[i]=br.readLine();
			
			// 암세포의 개수 계산
			int cnt=0;
			
			for(int i=0;i<N;i++)
				for(int j=0;j<M;j++)
					if(picture[i].charAt(j)=='#') {
						boolean iscancer=false;
						for(int k=0;k<8;k++) {
							int X=i+moveX[k];
							int Y=j+moveY[k];
							
							if(X>=0&&X<N&&Y>=0&&Y<M&&picture[X].charAt(Y)=='#') {
								iscancer=true;
								break;
							}
						}
						
						if(!iscancer) cnt++;
					}
			
			bw.write(cnt+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class