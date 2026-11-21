import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 데이터 세트의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	int a = Integer.valueOf(br.readLine());
        	
        	// 피라미드의 장식품 개수 계산
        	long piramid=0;
        	
        	for(long i=1;i<=a;i++)
        		piramid += i*(i+1)/2;
        	
        	// 피라미드의 장식품 개수 출력
        	bw.write(piramid+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class