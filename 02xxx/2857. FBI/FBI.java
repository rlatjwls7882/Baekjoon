import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean isFBI = false;
		
		for(int i=1;i<=5;i++) {
			String name = bf.readLine();
			
			if(name.indexOf("FBI")!=-1) {
				bw.write(i+" ");
				isFBI = true;
			}
		}
		if(isFBI==false)
			bw.write("HE GOT AWAY!");
		
		bw.close();
	} // end of main
} // end of main class