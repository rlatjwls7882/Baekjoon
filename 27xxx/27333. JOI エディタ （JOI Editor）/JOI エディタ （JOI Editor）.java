import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 길이 N의 문자열 입력
        int N = Integer.valueOf(br.readLine());
        String string = br.readLine();
        
        // JOI Editor의 실행 결과 출력
        bw.write(string.replace("jj", "JJ").replace("oo", "OO").replace("ii", "II"));
        bw.close();
    } // end of main
} // end of Main class