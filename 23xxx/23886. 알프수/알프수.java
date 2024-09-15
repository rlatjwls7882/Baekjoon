import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		char[] X = br.readLine().toCharArray();
		
		// 알프수인지 확인
		boolean alpsoo=true;
		
		if(X[1]-X[0]<=0||X[X.length-1]-X[X.length-2]>=0) {
			alpsoo=false;
		} else {
			for(int i=0;i+1<X.length;i++) {
				
				// 평지인 경우
				if(X[i+1]-X[i]==0) {
					alpsoo=false;
					break;
				}
				
				// 오르막의 기울기가 다른 경우
				if(i+2<X.length&&X[i+1]-X[i]>0&&X[i+2]-X[i+1]>0&&X[i+1]-X[i]!=X[i+2]-X[i+1]) {
					alpsoo=false;
					break;
				}
				
				// 내리막의 기울기가 다른 경우
				if(i+2<X.length&&X[i+1]-X[i]<0&&X[i+2]-X[i+1]<0&&X[i+1]-X[i]!=X[i+2]-X[i+1]) {
					alpsoo=false;
					break;
				}
			}
		}
		
		// 출력
		if(alpsoo) {
			bw.write("ALPSOO");
		} else {
			bw.write("NON ALPSOO");
		}
		
		bw.close();
	} // end of main()
} // end of Main class