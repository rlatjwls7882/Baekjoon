import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 게임 참가자의 수 p 입력
        int p = Integer.valueOf(br.readLine());
        
        // 카드를 내려놓는 순서 계산
        TreeMap<Integer, Character> card = new TreeMap<Integer, Character>();
        
        for(int i=0;i<p;i++) {
        	
        	// c개의 카드 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int c = Integer.valueOf(st.nextToken());
        	
        	while(c-->0)
        		card.put(Integer.valueOf(st.nextToken()), (char)(65+i));
        }
        
        // 카드를 내려놓는 순서 출력
        while(!card.isEmpty())
        	bw.write(card.pollFirstEntry().getValue());
        
        bw.close();
    } // end of main
} // end of Main class