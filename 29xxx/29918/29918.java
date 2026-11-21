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
        
        // Adalberd가 만드는 발명품의 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Adalberd = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())*10;
        
        // 경쟁자가 만드는 발명품의 최대 개수
        int max=0;
        
        for(int i=1;i<6;i++) {
        	st = new StringTokenizer(br.readLine());
        	int competitor = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())*10;
        	
        	if(competitor>max) max=competitor;
        }
        
        // Adalberd가 추가로 만들어야 하는 발명품의 개수 출력
        bw.write((Adalberd>max?0:max-Adalberd+1)+"");
        
        bw.close();
    } // end of main
} // end of Main class