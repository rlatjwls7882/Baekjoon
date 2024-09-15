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
        
        // 현재 시각과 소금 투하 시간 입력
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int CurH = Integer.valueOf(st.nextToken());
        int CurM = Integer.valueOf(st.nextToken());
        int CurS = Integer.valueOf(st.nextToken());
        
        st = new StringTokenizer(br.readLine(),":");
        int SaltH = Integer.valueOf(st.nextToken());
        int SaltM = Integer.valueOf(st.nextToken());
        int SaltS = Integer.valueOf(st.nextToken());
        
        // 소금을 투하할때까지 필요한 시간 계산
        SaltS -= CurS; SaltM -= CurM; SaltH -= CurH;
        
        if(SaltS>59) {
        	SaltS-=60;
        	SaltM++;
        }
        
        else if(SaltS<0) {
        	SaltS+=60;
        	SaltM--;
        }
        
        if(SaltM>59) {
        	SaltM-=60;
        	SaltH++;
        }
        
        else if(SaltM<0) {
        	SaltM+=60;
        	SaltH--;
        }
        
        if(SaltH>23)
        	SaltH-=24;
        
        else if(SaltH<0)
        	SaltH+=24;
        
        // 00:00:00 -> 24:00:00
        if(SaltH==SaltM&&SaltM==SaltS&&SaltS==0)
        	SaltH=24;
        
        // 소금을 투하할때까지 필요한 시간 출력
        bw.write(String.format("%02d", SaltH)
        		+":"+String.format("%02d", SaltM)
        		+":"+String.format("%02d", SaltS));
        bw.close();
    } // end of main
} // end of Main class