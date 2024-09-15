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
		int max = -1;
		String address = "";
		
		for(int i=1;i<10;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			for(int j=1;j<10;j++) {
				int tmp = Integer.valueOf(st.nextToken());
				
				if(tmp>max) {
					max = tmp;
					address = i+" "+j;
				}
			} // end of for j
		} // end of for i
		
		bw.write(max+"\n"+address);
		bw.close();
	} // end of main
} // end of main class