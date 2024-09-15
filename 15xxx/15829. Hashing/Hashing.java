import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열 string과 string의 길이 L을 입력
    	int L = Integer.valueOf(bf.readLine());
    	String string = bf.readLine();
    	
    	// 해시값 계산
    	long hashValue=0;
    	
    	for(int i=0;i<L;i++) {
    		long tmp=string.charAt(i)-'a'+1;
    		
    		// *31^i
    		for(int j=0;j<i;j++) {
    			tmp*=31;
    			tmp%=1234567891;
    		}
    		
    		hashValue+=tmp%1234567891;
    	}
    	
    	// 해시값 출력
    	bw.write(hashValue%1234567891+"");
    	bw.close();
    } // end of main
} // end of Main class