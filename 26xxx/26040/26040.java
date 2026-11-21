import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 A, 문자목록 B 입력
        String A = br.readLine();
        String B = br.readLine();
        
        // A에서 B에 있는 문자만 소문자로 변경
        for(int i=0;i<A.length();i++)
        	for(int j=0;j<B.length();j++) {
        		
        		if(A.charAt(i)==B.charAt(j)) {
        			bw.write(A.charAt(i)+32);
        			break;
        		}
        		
        		else if(j==B.length()-1)
        			bw.write(A.charAt(i)+"");
        	}
        
        bw.close();
    } // end of main
} // end of Main class