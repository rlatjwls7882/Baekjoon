import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String s1 = br.readLine();
			String s2 = br.readLine();
			String s3 = br.readLine();
			
			if(s2.length()>=s1.length()&&(s2.indexOf(s1)==0||s2.lastIndexOf(s1)==s2.length()-s1.length())||s3.length()>=s1.length()&&(s3.indexOf(s1)==0||s3.lastIndexOf(s1)==s3.length()-s1.length())
					||s1.length()>=s2.length()&&(s1.indexOf(s2)==0||s1.lastIndexOf(s2)==s1.length()-s2.length())||s3.length()>=s2.length()&&(s3.indexOf(s2)==0||s3.lastIndexOf(s2)==s3.length()-s2.length())
					||s1.length()>=s3.length()&&(s1.indexOf(s3)==0||s1.lastIndexOf(s3)==s1.length()-s3.length())||s2.length()>=s3.length()&&(s2.indexOf(s3)==0||s2.lastIndexOf(s3)==s2.length()-s3.length())) {
				bw.write("No\n");
			} else {
				bw.write("Yes\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class