import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열 하나 입력
    	String string = br.readLine();
    	
    	// kick의 등장 횟수 계산
    	int cnt=0;
    	
    	for(int i=0;i<string.length()-3;i++)
    		if(string.charAt(i)=='k'&&string.charAt(i+1)=='i'
               &&string.charAt(i+2)=='c'&&string.charAt(i+3)=='k')
    			cnt++;
    	
    	bw.write(cnt+"");
    	
    	bw.close();
    } // end of main
} // end of Main class