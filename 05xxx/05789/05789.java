import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스 수 입력
    	int n = Integer.valueOf(bf.readLine());
    	
    	while(n--!=0) {
    		//0과 1로 이루어진 문자열 입력
    		String string = bf.readLine();
    		
    		// 중앙의 두 수가 같은지 출력
    		if(string.charAt(string.length()/2-1)==string.charAt(string.length()/2))
    			bw.write("Do-it\n");
    		else
    			bw.write("Do-it-Not\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class