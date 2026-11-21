import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 상자의 수 C 입력
        int C = Integer.valueOf(br.readLine());
        
        // 상자의 내용물에서 플레이어가 얻을 수 있는 가장 높은 상품 계산
        int max=0, sum=0;
        
        while(C-->0) {
        	sum += Integer.valueOf(br.readLine());
        	
        	if(max<sum) max=sum;
        }
        
        // 얻을 수 있는 가장 높은 상금 출력
        bw.write(max+100+"");
        bw.close();
    } // end of main
} // end of Main class