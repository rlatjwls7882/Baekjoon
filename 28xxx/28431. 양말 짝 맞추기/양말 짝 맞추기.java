import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<5;i++) {
			int N = Integer.valueOf(bf.readLine());
			
			if(list.indexOf(N)==-1)
				list.add(N);
			else
				list.remove(list.indexOf(N));
		}
		
		bw.write(list.get(0)+"");
		bw.close();
	} // end of main
} // end of main class