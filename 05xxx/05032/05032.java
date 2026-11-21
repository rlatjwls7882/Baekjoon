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
    	
    	// 가지고 있는 병의 수, 교환에 필요한 병의 수
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int have = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
    	int require = Integer.valueOf(st.nextToken());
    	
    	// 준민이가 먹을 수 있는 탄산 음료의 개수 계산
    	int canEat=0;
    	
    	while(have/require!=0) {
    		int tmp = have/require;
    		have = have%require+tmp;
    		canEat += tmp;
    	}
    	
    	bw.write(canEat+"");
    	
    	bw.close();
    } // end of main
} // end of Main class