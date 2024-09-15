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

		// 문자열의 각 위치까지의 문자의 개수 계산
		String string = br.readLine();
		int length = string.length();
		
		int[][] sum = new int[length+1][26];
		
		for(int i=1;i<=length;i++) {
			for(int j=0;j<26;j++) {
				sum[i][j]=sum[i-1][j];
			}
			
			sum[i][string.charAt(i-1)-'a']++;
		}
		
		// l~r번째 문자 사이에 a 문자가 나타나는 횟수 계산
		int M = Integer.valueOf(br.readLine());
		
		while(M-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			int a = st.nextToken().charAt(0)-'a';
			int l = Integer.valueOf(st.nextToken());
			int r = Integer.valueOf(st.nextToken())+1;
			
			bw.write(Integer.toString(sum[r][a]-sum[l][a]));
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class