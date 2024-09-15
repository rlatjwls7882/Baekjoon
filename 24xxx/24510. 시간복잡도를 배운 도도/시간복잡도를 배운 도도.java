import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.valueOf(br.readLine());
		
		// 같은 줄에 있는 반복문의 최대 개수 계산
		int max=0;
		while(C-->0) {
			int cnt=0;
			String string = br.readLine();
			
			for(int i=0;i<=string.length()-3;i++) {
				
				// for
				if(string.charAt(i)=='f'&&string.charAt(i+1)=='o'&&string.charAt(i+2)=='r')
					cnt++;
				
				// while
				if(i<=string.length()-5&&string.charAt(i)=='w'&&string.charAt(i+1)=='h'&&string.charAt(i+2)=='i'&&string.charAt(i+3)=='l'&&string.charAt(i+4)=='e')
					cnt++;
			}
			
			if(max<cnt) max=cnt;
		}
		
		bw.write(max+"");
		
		bw.close();
	} // end of main()
} // end of Main class