import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 방 생성
        int[] room = new int[10];
        
        // n 길이의 이벤트 입력
        int n = Integer.valueOf(br.readLine());
        String event = br.readLine();
        
        for(int i=0;i<n;i++) {
        	
        	// 왼쪽으로 들어온 손님
        	if(event.charAt(i)=='L') {
        		for(int j=0;j<=9;j++)
        			if(room[j]==0) {
        				room[j]=1;
        				break;
        			}
        	}
        	
        	// 오른쪽으로 들어온 손님
        	else if(event.charAt(i)=='R') {
        		for(int j=9;j>=0;j--)
        			if(room[j]==0) {
        				room[j]=1;
        				break;
        			}
        	}
        	
        	// 손님이 방을 떠나는 경우
        	else
        		room[event.charAt(i)-'0']=0;
        }
        
        // 현재 방이 차있는 상태 출력
        for(int i=0;i<10;i++)
        	bw.write(room[i]+"");
        
        bw.close();
    } // end of main
} // end of Main class