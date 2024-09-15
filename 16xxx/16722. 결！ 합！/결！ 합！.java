import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		String[][] strings = new String[9][3];
		for(int i=0;i<9;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				strings[i][j] = st.nextToken();
			}
		}
		
		Set<String> set = new HashSet<>();
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<9;j++) {
				for(int k=j+1;k<9;k++) {
					int cnt=0;
					for(int l=0;l<3;l++) {
						if(strings[i][l].equals(strings[j][l]) && strings[i][l].equals(strings[k][l]) || !strings[i][l].equals(strings[j][l]) && !strings[i][l].equals(strings[k][l]) && !strings[j][l].equals(strings[k][l])) {
							cnt++;
						}
					}
					if(cnt==3) {
						set.add(""+i+j+k);
					}
				}
			}
		}
		
		int score=0;
		int n = Integer.valueOf(br.readLine());
		while(n-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char ch = st.nextToken().charAt(0);
			if(ch=='H') {
				int[] idx = { Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()) };
				Arrays.sort(idx);
				
				String string = ""+(idx[0]-1)+(idx[1]-1)+(idx[2]-1);
				if(set.contains(string)) {
					score++;
					set.remove(string);
				} else {
					score--;
				}
			} else {
				if(set.isEmpty()) {
					score+=3;
					set.add("used");
				} else {
					score-=1;
				}
			}
		}
		bw.write(Integer.toString(score));
    	
        bw.close();
    } // end of main
} // end of Main