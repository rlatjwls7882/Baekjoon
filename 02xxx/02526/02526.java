import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 자연수 N, P 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int P = Integer.valueOf(st.nextToken());
        
        // 반복되는 부분의 시작 위치 계산
        ArrayList<Integer> list = new ArrayList<Integer>();
        int index=0, tmp=N;
        
        while(true) {
        	
        	if(list.contains(tmp)) {
        		index = list.indexOf(tmp);
        		break;
        	}
        	
        	else
        		list.add(tmp);
        	
        	tmp = tmp*N%P;
        }
        
        // 반복되는 부분에 포함된 서로 다른 수의 개수 출력
        bw.write(list.size()-index+"");
        
        bw.close();
    } // end of main
} // end of Main class