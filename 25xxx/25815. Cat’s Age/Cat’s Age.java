import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 고양이의 나이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.valueOf(st.nextToken());
        int month = Integer.valueOf(st.nextToken());
        
        // 고양이의 나이를 사람 나이로 변환
        LocalDate age = LocalDate.of(0, 1, 1);
        
        if(year>=1) age = age.plusYears(15);
        if(year>=2) age = age.plusYears(9+(year-2)*4);
        
        if(year<1) age = age.plusMonths(month*15);
        else if(year<2) age = age.plusMonths(month*9);
        else age = age.plusMonths(month*4);
        
        // 사람 나이로 변환한 고양이의 나이 출력
        bw.write(age.getYear()+" "+(age.getMonthValue()-1));
        bw.close();
    } // end of main
} // end of Main class