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
    	
    	// 카드 생성
    	int[] cards = new int[20];
    	
    	for(int i=0;i<20;i++)
    		cards[i]=i+1;
    	
    	// 뒤집기 작업 수행
    	for(int i=0;i<10;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.valueOf(st.nextToken())-1;
    		int b = Integer.valueOf(st.nextToken())-1;
    		
    		while(a<b) {
    			int tmp=cards[a];
    			cards[a]=cards[b];
    			cards[b]=tmp;
    			
    			a++; b--;
    		}
    	}
    	
    	for(int i=0;i<20;i++)
    		bw.write(cards[i]+" ");
    	
    	bw.close();
    } // end of main
} // end of Main class