import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = bf.readLine();
		int A=0, B=0;
		
		for(int i=0;i<line.length();) {
			if(line.charAt(i++)=='A')
				A+=line.charAt(i++)-'0';
			else
				B+=line.charAt(i++)-'0';
			
			if(A>10||B>10) {
				if(A>=B+2) {
					bw.write("A");
					bw.close();
					return;
				}
				else if(B>=A+2) {
					bw.write("B");
					bw.close();
					return;
				}
			} // end of if
		} // end of for
		if(A>B)
			bw.write("A");
		else
			bw.write("B");
		
		bw.close();
	} // end of main
} // end of main class