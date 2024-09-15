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
		
		int[][] arr = new int[100][100];
		
		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			for(int i=x;i<x+10;i++)
				for(int j=y;j<y+10;j++)
					arr[i][j]++;
		}
		
		int num = 0;
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++)
				if(arr[i][j]>0)
					num++;
		
		bw.write(num+"");
		bw.close();
	} // end of main
} // end of main class