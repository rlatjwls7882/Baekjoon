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
        
        
        // 카드의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 카드 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> numberCard = new HashMap<String, Integer>();
        
        while(N--!=0) {
        	String card = st.nextToken();
        	
        	// 카드가 있으면 개수 증가
        	if(numberCard.containsKey(card))
        		numberCard.replace(card, numberCard.get(card)+1);
        	
        	// 카드가 없으면 새로 생성
        	else
        		numberCard.put(card, 1);
        }
        
        // 검색할 카드의 수 M 입력
        int M = Integer.valueOf(br.readLine());
        
        // M개의 카드가 각각 몇개인지 출력
        st = new StringTokenizer(br.readLine());
        
        while(M--!=0) {
        	String card = st.nextToken();
        	
        	if(numberCard.containsKey(card))
        		bw.write(numberCard.get(card)+" ");
        	else
        		bw.write("0 ");
        }
        
        bw.close();
    } // end of main
} // end of Main class