import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 문자열 입력
    	String string = br.readLine();
    	
    	// 문자열에 D2, d2가 있는지 확인
    	if(string.indexOf("d2")==-1&&string.indexOf("D2")==-1)
    		bw.write("unrated");
    	else
    		bw.write("D2");
    	
    	bw.close();
    } // end of main
} // end of Main class