import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		int diff=0;
		int n = Integer.valueOf(st.nextToken());
		int m = Integer.valueOf(st.nextToken());
		char[][] arr1 = new char[n][m];
		char[][] arr2 = new char[n][m];
		
		for(int i=0;i<n;i++)
			arr1[i] = bf.readLine().toCharArray();

		bf.readLine(); // 빈줄
		
		for(int i=0;i<n;i++)
			arr2[i] = bf.readLine().toCharArray();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++)
				if(arr1[i][j]==arr2[i][j])
						diff++;
		}
		bw.write(diff+"");
		bw.close();
	} // end of main
} // end of main class