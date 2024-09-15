import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String line;
		while((line=bf.readLine())!=null) {
			
			for(int i=0;i<line.length();i++) {
				
				if(line.charAt(i)=='i')
					bw.write("e");
				else if(line.charAt(i)=='e')
					bw.write("i");
				else if(line.charAt(i)=='I')
					bw.write("E");
				else if(line.charAt(i)=='E')
					bw.write("I");
				else
					bw.write(line.charAt(i)+"");
			}// end of for i
			bw.write("\n");
		}// end of while
		bw.close();
	} // end of main
} // end of main class