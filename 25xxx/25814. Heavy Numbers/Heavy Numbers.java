import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        
        // 두 수의 길이와 각 자리수의 합 계산
        int lenghA = (int)(Math.log10(A)+1);
        int lenghB = (int)(Math.log10(B)+1);
        
        int sumA=0;
        while(A!=0) {
        	sumA += A%10;
        	A/=10;
        }
        
        int sumB=0;
        while(B!=0) {
        	sumB += B%10;
        	B/=10;
        }
        
        // 더 무거운 수 출력
        if(lenghA*sumA>lenghB*sumB)
        	bw.write("1");
        else if(lenghA*sumA<lenghB*sumB)
        	bw.write("2");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class