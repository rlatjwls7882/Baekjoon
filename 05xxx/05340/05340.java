import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 위도(1~3번 문자열의 길이) 출력
        bw.write(String.format("Latitude %d:%d:%d\n", br.readLine().trim().length()
        		, br.readLine().trim().length(), br.readLine().trim().length()));
        
        // 경도(4~6번 문자열의 길이) 출력
        bw.write(String.format("Longitude %d:%d:%d", br.readLine().trim().length()
        		, br.readLine().trim().length(), br.readLine().trim().length()));
        
        bw.close();
    } // end of main
} // end of Main class