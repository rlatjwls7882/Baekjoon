import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int w = Integer.valueOf(bf.readLine());	
		int l = Integer.valueOf(bf.readLine());	
		int h = Integer.valueOf(bf.readLine());	
		
		if(w>l) {
			int tmp = w;
			w=l;
			l=tmp;
		}
		
		if(h*2<=w&&w*2>=l)
			bw.write("good");
		else
			bw.write("bad");
		
		bw.close();
	} // end of main
} // end of main class