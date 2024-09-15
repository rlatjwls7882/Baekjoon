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
        
        // 관찰 횟수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 소가 길을 건너간 횟수 계산
        HashMap<Integer, Integer> cow = new HashMap<Integer, Integer>();
        int change=0;
        
        while(N-->0) {
        	
        	// 소의 번호와 소의 위치 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int num = Integer.valueOf(st.nextToken());
        	int pos = Integer.valueOf(st.nextToken());
        	
        	// 소의 위치가 변했는지 확인
        	try {
				if(cow.get(num)!=pos)
					change++;
			} catch (Exception e) {}
        	
        	cow.put(num, pos);
        }
        
        // 소가 길을 건너간 횟수 출력
        bw.write(change+"");
        
        bw.close();
    } // end of main
} // end of Main class