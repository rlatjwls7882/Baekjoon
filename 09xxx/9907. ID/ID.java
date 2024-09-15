import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // NICE number 입력
        String NICE = br.readLine();
        
        // NICE 숫자와 가중치 곱의 합 계산
        String weight = "2765432";
        int sum=0;
        
        for(int i=0;i<7;i++)
        	sum += (NICE.charAt(i)-'0')*(weight.charAt(i)-'0');
        
        // 11로 나눈 나머지
        sum %= 11;
        
        // 해당하는 숫자의 대문자 출력
        String letter = "JABCDEFGHIZ";
        
        bw.write(letter.charAt(sum));
        bw.close();
    } // end of main
} // end of Main class