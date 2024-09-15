import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int A = Integer.valueOf(br.readLine());
		int T = Integer.valueOf(br.readLine());
		int slogan = Integer.valueOf(br.readLine());
		
		// 구하고자 하는 사람의 위치 계산
		int pos=-1;
		
		for(int i=0;;i++) {
			if(i%6==4) {
				for(int j=0;j<(i+5)/6+1;j++) {
					pos = (pos+1)%A;
					if(slogan==0) {
						if(--T==0) {
							break;
						}
					}
				}
			} else if(i%6==5) {
				for(int j=0;j<(i+5)/6+1;j++) {
					pos = (pos+1)%A;
					if(slogan==1) {
						if(--T==0) {
							break;
						}
					}
				}
			} else if(i%2==0) {
				pos = (pos+1)%A;
				if(slogan==0) {
					T--;
				}
			} else {
				pos = (pos+1)%A;
				if(slogan==1) {
					T--;
				}
			}

			if(T==0) {
				break;
			}
		}
		
		// 출력
		bw.write(Integer.toString(pos));
		
		bw.close();
	} // end of main()
} // end of Main class