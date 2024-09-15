import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열의 길이, 원본 텍스트, 학생이 다시 작성한 텍스트 입력
        int N = Integer.valueOf(br.readLine());
        String original = br.readLine();
        String rewritten = br.readLine();
        
        // 올바르게 다시 쓰여진 문자 수 계산
        int cnt=0;
        
        for(int i=0;i<N;i++)
        	if(original.charAt(i)==rewritten.charAt(i))
        		cnt++;
        
        // 올바르게 다시 쓰여진 문자 수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class