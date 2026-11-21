import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 개수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        // 영웅이 이긴 전투의 수 계산
        int win=0;
        
        while(T--!=0) {
        	
        	// 영웅이 전투에서 사용한 스킬 로그 입력
        	String skill = br.readLine();
        	
        	// C, D를 연속으로 사용하지 않은 전투에서 승리
        	if(skill.indexOf("CD")==-1)
        		win++;
        }
        
        // 영웅이 이긴 전투의 수 출력
        bw.write(win+"");
        bw.close();
    } // end of main
} // end of Main class