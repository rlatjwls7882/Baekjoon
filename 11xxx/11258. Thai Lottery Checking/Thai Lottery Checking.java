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
        
        // 당첨하는 경우인 첫 N글자, 마지막 N글자와 당첨금 입력
        HashMap<String, Integer> first = new HashMap<String, Integer>();
        HashMap<String, Integer> last = new HashMap<String, Integer>();
        
        for(int i=0;i<3;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	first.put(st.nextToken(), Integer.valueOf(st.nextToken()));
        }
        
        for(int i=0;i<3;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	last.put(st.nextToken(), Integer.valueOf(st.nextToken()));
        }
        
        while(true) {
        	
        	// 복권 번호 입력
        	String lotto = br.readLine();
        	
        	// -1 입력시 종료
        	if(lotto.equals("-1")) break;
        	
        	// 당첨금 계산
        	int money=0;
        	
        	// 6자리
        	if(first.containsKey(lotto))
        		money += first.get(lotto);
        	
        	// 첫 3자리
        	if(first.containsKey(lotto.substring(0,3)))
        		money += first.get(lotto.substring(0,3));
        	
        	// 마지막 3자리
        	if(last.containsKey(lotto.substring(3,6)))
        		money += last.get(lotto.substring(3,6));
        	
        	// 마지막 2자리
        	if(last.containsKey(lotto.substring(4,6)))
        		money += last.get(lotto.substring(4,6));
        	
        	// 당첨금 출력
        	bw.write(money+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class