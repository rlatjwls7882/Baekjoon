import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 모든 문자열을 마침표 찍어서 출력
        while(N-->0) {
        	
        	String string = br.readLine();
        	
        	if(string.charAt(string.length()-1)=='.')
        		bw.write(string+"\n");
        	else
        		bw.write(string+".\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class