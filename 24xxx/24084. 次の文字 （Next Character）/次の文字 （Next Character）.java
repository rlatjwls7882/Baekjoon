import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열의 길이 N, 문자열 str
    	int N = Integer.valueOf(br.readLine());
    	String str = br.readLine();
    	
    	// 문자 입력
    	for(int i=0;i<N-1;i++)
    		if(str.charAt(i+1)=='J')
    			bw.write(str.charAt(i)+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class