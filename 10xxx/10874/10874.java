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
        
        // 재시험을 봐야하는 학생 확인
        for(int numCases=1;numCases<=N;numCases++)
        	if(br.readLine().equals("1 2 3 4 5 1 2 3 4 5"))
        		bw.write(numCases+"\n");
        
        bw.close();
    } // end of main
} // end of Main class