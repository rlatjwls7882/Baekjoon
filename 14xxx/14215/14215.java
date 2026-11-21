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
		
		int a = Integer.valueOf(st.nextToken());
		int b = Integer.valueOf(st.nextToken());
		int c = Integer.valueOf(st.nextToken());
		int MaxLength = 0;
		
		for(int i=1;i<=a;i++)
			for(int j=1;j<=b;j++)
				for(int k=1;k<=c;k++) {
					if(i>=j&&i>=k&&i<j+k&&MaxLength<i+j+k)
						MaxLength=i+j+k;
					else if(j>=i&&j>=k&&j<i+k&&MaxLength<i+j+k)
						MaxLength=i+j+k;
					else if(k>=i&&k>=j&&k<i+j&&MaxLength<i+j+k)
						MaxLength=i+j+k;
				}
		
		bw.write(MaxLength+"");
		bw.close();
	} // end of main
} // end of main class