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
        
        // 카드의 종류 생성
        int[] cards = {8, 5, 2, 6, 3, 0};
        String[] name = {"Province", "Duchy", "Estate", "Gold", "Silver", "Copper"};
        
        // 현재 구매력 계산
        int buying_power=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<3;i++)
        	buying_power += Integer.valueOf(st.nextToken())*(3-i);
        
        // 살 수 있는 가장 좋은 승리 포인트 카드 출력
        for(int i=0;i<3;i++)
        	if(buying_power>=cards[i]) {
        		bw.write(name[i]+" or ");
        		break;
        	}
        
        // 살 수 있는 가장 좋은 보물 카드 출력
        for(int i=3;i<6;i++)
        	if(buying_power>=cards[i]) {
        		bw.write(name[i]);
        		break;
        	}
        
        bw.close();
    } // end of main
} // end of Main class