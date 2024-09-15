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
        
        // 문자열에 포함되어 있는 JOI의 개수 출력
        int index=0, num=0;
        
        while(string.indexOf("JOI",index)!=-1) {
        	index = string.indexOf("JOI",index)+1;
        	num++;
        }
        
        bw.write(num+"\n");
        
        // 문자열에 포함되어 있는 IOI의 개수 출력
        index=0; num=0;
        
        while(string.indexOf("IOI",index)!=-1) {
        	index = string.indexOf("IOI",index)+1;
        	num++;
        }
        
        bw.write(num+"");
        bw.close();
    } // end of main
} // end of Main class