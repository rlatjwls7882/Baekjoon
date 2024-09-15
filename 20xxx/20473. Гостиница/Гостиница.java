import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 대표단의 인원수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 2인실과 3인실의 수 계산
        int room2=0;
        
        while(n%3!=0) {
        	room2++;
        	n-=2;
        }
        
        int room3=n/3;
        
        // 2인실과 3인실의 수 출력
        bw.write(room2+" "+room3);
        bw.close();
    } // end of main
} // end of Main class