import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 하나의 문자열 입력
        String string = br.readLine();
        
        // UCF로 변환된 문자열 출력
        int pos=0;
        
        // 가장 왼쪽 U 전까지 - 출력
        for(;pos<string.indexOf("U");pos++)
        	bw.write("-");
        
        bw.write("U"); pos++;
        
        // 가장 오른쪽 F 전까지 C 출력
        for(;pos<string.lastIndexOf("F");pos++)
        	bw.write("C");
        
        bw.write("F"); pos++;
        
        // 가장 오른쪽 F부터 - 출력
        for(;pos<string.length();pos++)
        	bw.write("-");
        
        bw.close();
    } // end of main
} // end of Main class