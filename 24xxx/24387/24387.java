import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 아카시아, 라임, 해바라기 꿀의 kg당 가격 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] A = new long[3];
        
        for(int i=0;i<3;i++)
        	A[i] = Long.valueOf(st.nextToken());
        Arrays.sort(A);
        
        // 꿀을 담을 수 있는 통 3개의 크기 입력
        st = new StringTokenizer(br.readLine());
        long[] B = new long[3];
        
        for(int i=0;i<3;i++)
        	B[i] = Long.valueOf(st.nextToken());
        Arrays.sort(B);
        
        // 농부가 얻을 수 있는 최대 금액 출력
        bw.write(A[0]*B[0]+A[1]*B[1]+A[2]*B[2]+"");
        
        bw.close();
    } // end of main
} // end of Main class