import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 연도 입력
        	int year = Integer.valueOf(br.readLine());
        	
        	// 0 입력시 종료
        	if(year==0)
        		break;
        	
        	// 하계 올림픽이 개최됐어야 하나 전쟁이 있었던 해
        	if(year%4==0&&((1914<=year&&year<=1918)||(1939<=year&&year<=1945)))
        		bw.write(year+" Games cancelled\n");
        	
        	// 하계 올림픽이 개최될 연도지만 개최 도시가 정해지지 않은 해
        	else if(year%4==0&&year>=2024)
        		bw.write(year+" No city yet chosen\n");
        	
        	// 하계 올림픽이 개최되었거나 개최될 예정일 해
        	else if(year%4==0&&year>=1896)
        		bw.write(year+" Summer Olympics\n");
        	
        	// 그 외 해
        	else
        		bw.write(year+" No summer games\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class