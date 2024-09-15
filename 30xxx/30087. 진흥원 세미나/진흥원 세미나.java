import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 세미나 종류와 그 세미나가 열리는 교실 생성
        HashMap<String, String> semina = new HashMap<String, String>();
        
        semina.put("Algorithm", "204\n");
        semina.put("DataAnalysis", "207\n");
        semina.put("ArtificialIntelligence", "302\n");
        semina.put("CyberSecurity", "B101\n");
        semina.put("Network", "303\n");
        semina.put("Startup", "501\n");
        semina.put("TestStrategy", "105\n");
        
        // 신청한 세미나의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 각 세미나가 열리는 교실 출력
        while(N-->0)
        	bw.write(semina.get(br.readLine()));
        
        bw.close();
    } // end of main
} // end of Main class