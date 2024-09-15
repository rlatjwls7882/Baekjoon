import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String ISBN = br.readLine();
		String weight = "13";
		
		// 훼손된 숫자를 제외한 숫자의 합 계산
		int sum = ISBN.charAt(12)-'0', pos=0;
		for(int i=0;i<12;i++) {
			if(ISBN.charAt(i)!='*') {
				sum += (ISBN.charAt(i)-'0')*(weight.charAt(i%2)-'0');
				sum %=10;
			} else {
				pos=i;
			}
		}
		
		// 훼손된 숫자 찾기
		for(int i=0;i<10;i++) {
			if((sum+i*(weight.charAt(pos%2)-'0'))%10==0) {
				bw.write(Integer.toString(i));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class