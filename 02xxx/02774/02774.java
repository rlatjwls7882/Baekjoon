import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 테스트 케이스의 개수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	// 각 수의 아름다운 정도 계산
    	while(T-->0) {
    		
    		String X = br.readLine();
    		
    		HashSet<Character> nums = new HashSet<>();
    		for(int i=0;i<X.length();i++)
    			nums.add(X.charAt(i));
    		
    		bw.write(nums.size()+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class