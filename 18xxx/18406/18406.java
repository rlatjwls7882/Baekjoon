import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 점수 N 입력
    	String N = br.readLine();
    	
    	// 럭키 스트레이트를 사용할 수 있는지 확인
    	int halfScore=0;
    	
    	for(int i=0;i<N.length();i++) {
    		if(i<N.length()/2)
    			halfScore+=N.charAt(i);
    		else
    			halfScore-=N.charAt(i);
    	}
    	
    	bw.write(halfScore==0?"LUCKY":"READY");
    	
    	bw.close();
    } // end of main
} // end of Main class