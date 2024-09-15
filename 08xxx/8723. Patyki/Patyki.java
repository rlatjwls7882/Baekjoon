import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());		
		
		int[] arr = new int[3];
		
		for(int i=0;i<3;i++)
			arr[i] = Integer.valueOf(st.nextToken());
		
		Arrays.sort(arr);
		
		if(arr[0]==arr[2])
			bw.write("2");
		
		else if(arr[0]*arr[0]+arr[1]*arr[1]==arr[2]*arr[2])
			bw.write("1");
		
		else
			bw.write("0");
		
		bw.close();
	} // end of main
} // end of main class