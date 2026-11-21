import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.valueOf(br.readLine());
        
        // 카드의 과일 수
        HashMap<String, Integer> cards = new HashMap<>();
        while(N-->0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String fruit = st.nextToken();
        	
        	cards.put(fruit, cards.getOrDefault(fruit, 0)+Integer.valueOf(st.nextToken()));
        }
        
        // 종을 쳐야 하는지 확인
        boolean hit=false;
        for(int i:cards.values())
        	if(i==5) {
        		hit=true;
        		break;
        	}
        
        bw.write(hit?"YES":"NO");
        
        bw.close();
    } // end of main
} // end of Main class