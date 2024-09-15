import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 결투 전 지팡이가 섬기고 있던 마법사 입력
        char owner = br.readLine().charAt(0);
        
        // 결투의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 지팡이가 섬긴 주인의 수 계산
        HashSet<Character> own = new HashSet<Character>();
        own.add(owner);
        
        while(N-->0) {
        	
        	// 공백으로 구분된 Z1 Z2 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	char Z1 = st.nextToken().charAt(0);
        	char Z2 = st.nextToken().charAt(0);
        	
        	// 현재 지팡이가 Z2를 섬기고 있는 경우
        	if(Z2==owner) {
        		owner = Z1;
        		own.add(owner);
        	}
        }
        
        // 현재 주인과 지팡이가 섬긴 주인의 수 출력
        bw.write(owner+"\n"+own.size());
        bw.close();
    } // end of main
} // end of Main class