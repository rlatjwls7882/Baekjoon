import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 두 문자열 입력
    	String str1 = br.readLine();
    	String str2 = br.readLine();
    	
    	// 두 문자열 비교후 출력
    	for(int i=0;i<str1.length();i++)
    		if(str1.charAt(i)>str2.charAt(i))
    			bw.write(str1.charAt(i));
    		else
    			bw.write(str2.charAt(i));
    	
    	bw.close();
    } // end of main
} // end of Main class