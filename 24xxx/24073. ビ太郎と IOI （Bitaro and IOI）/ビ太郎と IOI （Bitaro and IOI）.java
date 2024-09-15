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
		String S = br.readLine();
		
		boolean chk=false;
		for(int i=0;i<N-2;i++) {
			if(S.charAt(i)=='I') {
				for(int j=i+1;j<N-1;j++) {
					if(S.charAt(j)=='O') {
						for(int k=j+1;k<N;k++) {
							if(S.charAt(k)=='I') {
								chk=true;
								i=j=k=N;
							}
						}
					}
				}
			}
		}
		bw.write(chk?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class