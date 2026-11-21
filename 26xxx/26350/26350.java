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
		StringTokenizer st;
		
		int n = Integer.valueOf(bf.readLine());
		
		while(n--!=0) {
			st = new StringTokenizer(bf.readLine());
			int m = Integer.valueOf(st.nextToken());
			int[] arr = new int[m];
			int GoodNum = 0;
			
			bw.write("Denominations:");
			
			for(int i=0;i<m;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
				bw.write(" "+arr[i]);
			}
			bw.write("\n");
			
			for(int i=0;i<m-1;i++)
				if(arr[i]*2<=arr[i+1])
					GoodNum++;
			
			if(GoodNum==m-1)
				bw.write("Good coin denominations!\n\n");
			else
				bw.write("Bad coin denominations!\n\n");
		}
		
		bw.close();
	} // end of main
} // end of main class