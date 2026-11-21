import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 생일 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 생일 입력
        HashSet<String> birthday = new HashSet<String>();
        
        while(n-->0)
        	birthday.add(br.readLine());
        
        // 서로 다른 생일의 개수 출력
        bw.write(birthday.size()+"");
        bw.close();
    } // end of main
} // end of Main class