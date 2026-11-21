import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// k 입력
    	String k = br.readLine();
    	
    	// k의 모든 자리수가 등차수열을 이루는지 확인
    	boolean isCute=true;
    	
    	for(int i=1;i<k.length()-1;i++)
    		if(k.charAt(i)-k.charAt(i-1)!=k.charAt(i+1)-k.charAt(i))
    			isCute=false;
    	
    	bw.write(isCute?"◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!":"흥칫뿡!! <(￣ ﹌ ￣)>");
    	
    	bw.close();
    } // end of main
} // end of Main class