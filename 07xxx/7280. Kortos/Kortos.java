import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 52장의 카드 생성
        HashSet<String> cards = new HashSet<String>();
        
        for(int i=1;i<=13;i++) {
        	cards.add("S "+i);
        	cards.add("B "+i);
        	cards.add("V "+i);
        	cards.add("K "+i);
        }
        
        // 51장의 카드 입력
        for(int i=0;i<51;i++)
        	cards.remove(br.readLine());
        
        // 없는 카드 출력
        cards.forEach(System.out::print);
        
    } // end of main
} // end of Main class