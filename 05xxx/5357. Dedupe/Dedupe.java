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
		char tmp=' '; // 중복 확인
		
		while(N--!=0) {
			String string = bf.readLine();
			
			for(int i=0;i<string.length();i++) {
				
				if(tmp==string.charAt(i))
					continue;
				
				bw.write(string.charAt(i));
				
				tmp=string.charAt(i); //최근 사용한 문자
				
			} //end of for i
			
			tmp = ' '; //tmp 초기화
			bw.write("\n");
		} // end of while N
		
		bw.close();
	} // end of main
} // end of main class