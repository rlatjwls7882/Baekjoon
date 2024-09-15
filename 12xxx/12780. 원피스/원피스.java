import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String H = br.readLine();
        String N = br.readLine();
        
        // H에서 N이 등장한 횟수 계산
        int cnt=0, index=0;
        
        while(H.indexOf(N,index)!=-1) {
        	cnt++;
        	index = H.indexOf(N,index)+1;
        }
        
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class