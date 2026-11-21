import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	
    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String tmp = st.nextToken();
    		if(tmp.equals("#")) break;
    		int cur = Integer.valueOf(tmp);
    		
    		boolean chk=true;
    		boolean[] visited = new boolean[21];
    		visited[cur]=true;
    		while(st.hasMoreTokens()) {
    			String string = st.nextToken();
    			if(string.charAt(0)=='U') cur += string.charAt(1)-'0';
    			else cur -= string.charAt(1)-'0';
    			if(cur<1 || cur>20 || visited[cur]) {
    				chk=false;
    				break;
    			}
    			visited[cur]=true;
    		}
    		
    		if(!chk) {
    			bw.write("illegal\n");
    		} else {
    			boolean none=true;
    			for(int i=1;i<=20;i++) {
    				if(!visited[i]) {
    					none=false;
    					bw.write(i+" ");
    				}
    			}
    			if(none) bw.write("none");
    			bw.write('\n');
    		}
    	}
    	
        bw.close();
    } // end of main
} // end of Main class