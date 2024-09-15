import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        String name = br.readLine();
        
        // 이름 점수 계산
        int sum=0;
        for(int i=0;i<N;i++)
        	sum += name.charAt(i)-64;
        
        bw.write(sum+"");
        	
        bw.close();
    } // end of main
} // end of Main class