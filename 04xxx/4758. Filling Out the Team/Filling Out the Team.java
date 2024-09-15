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
        
        // 
        while(true) {
        	
        	// 속도 중량 힘 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double speed = Double.valueOf(st.nextToken());
        	double weight = Double.valueOf(st.nextToken());
        	double strength = Double.valueOf(st.nextToken());
        	
        	// 속도 중량 힘이 모두 0인 경우 종료
        	if(speed==0&&weight==0&&strength==0)
        		break;
        	
        	// 선수가 뛸 수 있는 포지션 모두 확인
        	StringBuilder positions = new StringBuilder();
        	
        	if(speed<=4.5&&weight>=150&&strength>=200)
        		positions.append("Wide Receiver ");
        	
        	if(speed<=6&&weight>=300&&strength>=500)
        		positions.append("Lineman ");
        	
        	if(speed<=5&&weight>=200&&strength>=300)
        		positions.append("Quarterback");
        	
        	// 선수가 뛸 수 있는 포지션 출력
        	if(positions.isEmpty())
        		bw.write("No positions\n");
        	else
        		bw.write(positions+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class