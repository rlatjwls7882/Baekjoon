import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.valueOf(bf.readLine());
		
		if(n==0) {
			bw.write(" * * *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");
		}
		else if(n==1) {
			bw.write("\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
		}
		else if(n==2) {
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write(" * * *\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write(" * * *\n");
		}
		else if(n==3) {
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write(" * * *\n");			
		}
		else if(n==4) {
			bw.write("\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
		}
		else if(n==5) {
			bw.write(" * * *\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write(" * * *\n");			
		}
		else if(n==6) {
			bw.write(" * * *\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write("*\n");
			bw.write(" * * *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");			
		}
		else if(n==7) {
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
		}
		else if(n==8) {
			bw.write(" * * *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");			
		}
		else if(n==9) {
			bw.write(" * * *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write("*     *\n");
			bw.write(" * * *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write("      *\n");
			bw.write(" * * *\n");			
		}

		bw.close();
	} // end of main
} // end of main class