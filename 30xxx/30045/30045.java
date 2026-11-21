import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 홍보 글의 문장 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 영일이 이모티콘을 넣은 횟수 계산
        int cnt=0;
        
        while(N-->0) {
        	String string = br.readLine();
        	if(string.indexOf("01")!=-1||string.indexOf("OI")!=-1)
        		cnt++;
        }
        
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class