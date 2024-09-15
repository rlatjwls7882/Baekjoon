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
        
        // DKSH가 나타난 횟수 계산
        int cnt=0, index=0;
        
        while(string.indexOf("DKSH",index)!=-1) {
        	index = string.indexOf("DKSH",index)+1;
        	cnt++;
        }
        
        // DKSH가 나타난 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class