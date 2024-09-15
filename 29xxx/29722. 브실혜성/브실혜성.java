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
        
        // 오늘 날짜 입력
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        int yyyy = Integer.valueOf(st.nextToken());
        int mm = Integer.valueOf(st.nextToken());
        int dd = Integer.valueOf(st.nextToken());
        
        // 혜성의 주기 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 브실이를 볼 수 있는 날짜 계산
        yyyy += N/360; N%=360;
        mm += N/30; N%=30;
        dd += N;
        
        if(dd>30) {
        	dd-=30;
        	mm++;
        }
        
        if(mm>12) {
        	mm-=12;
        	yyyy++;
        }
        
        // 브실이를 볼 수 있는 날짜 출력
        bw.write(String.format("%04d-%02d-%02d", yyyy, mm, dd)+"");
        bw.close();
    } // end of main
} // end of Main class