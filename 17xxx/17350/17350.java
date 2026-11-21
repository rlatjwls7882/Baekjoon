import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 멤버 수 N 입력
    	int N = Integer.valueOf(br.readLine());
    	
    	// '뭐'가 있는지 확인
    	boolean isThereAnj = false;
    	
    	while(N--!=0) {
    		String name = br.readLine();
    		
    		if(name.equals("anj")) {
    			isThereAnj = true;
    			break;
    		}
    	}
    	
    	// '뭐'가 있는지 출력
    	if(isThereAnj)
    		bw.write("뭐야;");
    	else
    		bw.write("뭐야?");
    	
    	bw.close();
    } // end of main
} // end of Main class