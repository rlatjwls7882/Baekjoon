import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 현재 방 번호 입력
        	long roomNum = Long.valueOf(br.readLine());
        	
        	// 현재 층 수 계산
        	int floor=1;
        	
        	for(long i=1;i<roomNum;i*=2) {
        		roomNum -= i;
        		floor++;
        	}
        	
        	while(true) {
        		
        		// 층수 출력
        		bw.write(floor+"");
        		
        		// 호수가 총 18자리가 되도록 0 출력
        		int zeroNum = 18-(int)(Math.log10(roomNum)+1);
        		
        		for(int i=0;i<zeroNum;i++)
        			bw.write("0");
        		
        		// 호수 출력
        		bw.write(roomNum+"\n");
        		
        		// 1층인 경우 종료
        		if(floor==1) break;
        		
        		// 다음 층 입장
        		if(roomNum%2==1)
        			roomNum = (roomNum+1)/2;
        		else
        			roomNum/=2;
        		floor--;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class