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
        
        // 날짜의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int y = Integer.valueOf(st.nextToken());
        	int m = Integer.valueOf(st.nextToken())-1;
        	int d;
        	
        	// 12월이 되는 경우
        	if(m==0) {
        		y-=1;
        		m=12;
        		d=31;
        	}
        	
        	// 4월, 6월, 9월, 11월이 되는 경우
        	else if(m==4||m==6||m==9||m==11)
        		d=30;
        	
        	// 1월, 3월, 5월, 7월, 8월, 10월이 되는 경우
        	else if(m==1||m==3||m==5||m==7||m==8||m==10)
        		d=31;
        	
        	// 2월 윤년이 되는 경우
        	else if(m==2&&(y%100!=0&&y%4==0||y%400==0))
        		d=29;
        	
        	// 2월 평년이 되는 경우
        	else d=28;
        	
        	// 날짜 출력
        	bw.write(y+" "+m+" "+d+"\n");
        }
                
        bw.close();
    } // end of main
} // end of Main class