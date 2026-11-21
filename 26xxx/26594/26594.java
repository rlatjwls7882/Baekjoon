import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 성우가 입력한 문자열
        String string = br.readLine();
        
        // 문자가 반복되는 횟수 계산
        int N=1;
        
        for(int i=0;i<string.length()-1;i++) {
        	if(string.charAt(i)==string.charAt(i+1))
        		N++;
        	
        	else
        		break;
        }
        
        // 문자가 반복되는 횟수 출력
        bw.write(N+"");
        bw.close();
    } // end of main
} // end of Main class