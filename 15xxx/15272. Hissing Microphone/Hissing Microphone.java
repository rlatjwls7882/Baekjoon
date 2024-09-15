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
        
        // 'ss' 등장하는지 확인
        if(string.indexOf("ss")!=-1)
        	bw.write("hiss");
        else
        	bw.write("no hiss");
        
        bw.close();
    } // end of main
} // end of Main class