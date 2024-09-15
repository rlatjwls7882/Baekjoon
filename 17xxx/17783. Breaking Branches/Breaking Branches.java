import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 가지의 길이 입력
        int n = Integer.valueOf(br.readLine());
        
        // 앨리스가 이기는 경우
        if(n%2==0)
        	bw.write("Alice\n1");
        
        // 밥이 이기는 경우
        else
        	bw.write("Bob");
        
        bw.close();
    } // end of main
} // end of Main class