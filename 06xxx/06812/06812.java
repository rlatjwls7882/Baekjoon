import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 오타와의 시간 입력
        int OttawaTime = Integer.valueOf(br.readLine());
        
        // 각 도시의 시간 출력
        int[] time = {0, -300, -200, -100, 0, 100, 130};
        String[] city = {"Ottawa", "Victoria", "Edmonton"
        		, "Winnipeg", "Toronto", "Halifax", "St. John's"};
        
        for(int i=0;i<7;i++) {
        	
        	int hhmm = OttawaTime+time[i];
        	
        	if(hhmm%100>=60)
        		hhmm += 40;
        	
        	if(hhmm>=2400)
        		hhmm-=2400;
        	
        	if(hhmm<0)
        		hhmm+=2400;
        	
        	bw.write(String.format("%d in %s\n", hhmm, city[i]));
        }
        
        bw.close();
    } // end of main
} // end of Main class