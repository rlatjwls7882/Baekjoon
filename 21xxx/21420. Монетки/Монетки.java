import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 동전의 개수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 뒷면의 개수 계산
        int back=0;
        
        for(int i=0;i<N;i++)
        	back += Integer.valueOf(br.readLine());
        
        // 모두 같은면으로 만들기 위해 뒤집어야 하는 최소 동전의 개수를 출력
        if(N-back<back)
        	bw.write(N-back+"");
        else
        	bw.write(back+"");
        
        bw.close();
    } // end of main
} // end of Main class