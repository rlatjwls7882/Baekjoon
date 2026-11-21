import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			int N = Integer.valueOf(br.readLine());
			
			String name="";
			int size=0;
			while(N-->0) {
				String string = br.readLine();
				boolean[] chars = new boolean[26];
				int cnt=0;
				for(int j=0;j<string.length();j++) {
					if('A'<=string.charAt(j)&&string.charAt(j)<='Z') {
						int idx=string.charAt(j)-'A';
						if(!chars[idx]) {
							chars[idx]=true;
							cnt++;
						}
					}
				}
				if(size<cnt||size==cnt&&string.compareTo(name)<0) {
					name=string;
					size=cnt;
				}
			}
			bw.write("Case #"+i+": "+name+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class