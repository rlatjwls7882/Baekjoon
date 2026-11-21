import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	while(N-->0) {
    		
    		// 두 개의 문자열 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String A = st.nextToken();
    		String B = st.nextToken();
    		
    		// 두 문자열의 구성요소가 같은지 확인
    		boolean isEqual=true;
    		int[] form = new int[26];
    		
    		try {
    			for(int i=0;i<A.length();i++) {
    				form[A.charAt(i)-'a']++;
    				form[B.charAt(i)-'a']--;
    			}
    			
    			for(int i=0;i<26;i++)
    				if(form[i]!=0) {
    					isEqual=false;
    					break;
    				}
			} catch (IndexOutOfBoundsException e) { isEqual=false; }
    		
    		bw.write(isEqual?"Possible\n":"Impossible\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class