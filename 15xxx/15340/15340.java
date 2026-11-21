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
        
        while(true) {
        	
        	// 통화 시간과 데이터 사용량 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int c = Integer.valueOf(st.nextToken());
        	int d = Integer.valueOf(st.nextToken());
        	
        	// 0 0 입력시 종료
        	if(c==0&&d==0)
        		break;
        	
        	// ParsTel 통신사의 비용
        	int ParsTel = c*30+d*40;
        	
        	// ParsCell 통신사의 비용
        	int ParsCell = c*35+d*30;
        	
        	// ParsPhone 통신사의 비용
        	int ParsPhone = c*40+d*20;
        	
        	// 통신사 비용의 최솟값 출력
        	if(ParsTel<ParsCell&&ParsTel<ParsPhone)
        		bw.write(ParsTel+"\n");
        	
        	else if(ParsCell<ParsPhone)
        		bw.write(ParsCell+"\n");
        	
        	else
        		bw.write(ParsPhone+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class