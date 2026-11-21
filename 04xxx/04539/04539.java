import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			String string = br.readLine();
			
			// 수를 담는 배열 생성
			int length = string.length()+1;
			int[] num = new int[length];
			
			for(int i=1;i<length;i++) {
				num[i] = string.charAt(i-1)-'0';
			}
			
			// 반올림 수행
			for(int i=length-1;i>=2;i--) {
				if(num[i]>=5) {
					num[i-1]++;
				}
			}
			
			// 최종 값 출력
			for(int i=0;i<length;i++) {
				
				// 첫 자리수 출력
				if(i==0&&num[0]!=0) {
					bw.write(Integer.toString(num[0]));
				} else if(i==1&&num[0]==0) {
					bw.write(Integer.toString(num[1]));
				}
				
				// 첫 자리수가 출력된 이후의 자리수 출력
				else if(i!=0) {
					bw.write("0");
				}
			}
			
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class