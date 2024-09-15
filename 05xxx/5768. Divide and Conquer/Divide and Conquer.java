import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			int M = Integer.valueOf(st.nextToken());
			if(M==0) {
				break;
			}
			
			int maxX=-1, maxY=-1;
			for(int X=M;X>=N;X--) {
				int Y=0;
				for(int i=1;i*i<=X;i++) {
					if(X%i==0) {
						if(i==X/i) {
							Y++;
						} else {
							Y+=2;
						}
					}
				}
				
				if(maxY<Y||maxY==Y&&maxX<=X) {
					maxY=Y;
					maxX=X;
				}
			}
			bw.write(maxX+" "+maxY+"\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class