import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 지폐 종류
        int[] money = {1000, 5000, 10000, 50000};
        
        //지폐의 개수 N
        int N = Integer.valueOf(br.readLine());
        
        // 지폐의 총액 계산
        int totalMoney=0;
        
        while(N--!=0)
        	totalMoney += money[(Integer.valueOf(br.readLine().substring(0,3))-136)/6];
        
        // 지폐의 총액 출력
        bw.write(totalMoney+"");
        
        bw.close();
    } // end of main
} // end of Main class