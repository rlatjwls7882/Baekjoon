import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S와 문자열의 길이 N 입력
        int N = Integer.valueOf(br.readLine());
        String S = br.readLine();
        
        // H, I, A, R, C가 각각 나온 횟수 계산
        int H=0, I=0, A=0, R=0, C=0;
        for(int i=0;i<N;i++) {
        	
        	if(S.charAt(i)=='H')
        		H++;
        	else if(S.charAt(i)=='I')
        		I++;
        	else if(S.charAt(i)=='A')
        		A++;
        	else if(S.charAt(i)=='R')
        		R++;
        	else if(S.charAt(i)=='C')
        		C++;
        }
        
        // 만들 수 있는 이모지의 최대개수 출력
        bw.write(Math.min(H, Math.min(I, Math.min(A, Math.min(R, C))))+"");
        bw.close();
    } // end of main
} // end of Main class