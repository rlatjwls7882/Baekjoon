import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문장의 글자수, 오리지널 문장, 다시쓴 문장 입력
        int n = Integer.valueOf(br.readLine());
        String original = br.readLine();
        String rewritten = br.readLine();
        
        // 잘못 쓴 문자 수 계산
        int cnt=0;
        
        for(int i=0;i<n;i++)
        	if(original.charAt(i)!=rewritten.charAt(i))
        		cnt++;
        
        // 잘못 쓴 문자 수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class