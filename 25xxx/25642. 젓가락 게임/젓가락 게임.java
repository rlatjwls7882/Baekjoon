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
        
        // 용태와 유진의 손가락 개수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Yong = Integer.valueOf(st.nextToken());
        int Yu = Integer.valueOf(st.nextToken());
        
        for(int i=1;;i++) {
        	
        	// 용태가 선공
        	if(i%2==1)
        		Yu += Yong;
        	
        	else
        		Yong += Yu;
        	
        	// 손가락이 5개 이상이 될 경우 종료
        	if(Yong>4) {
        		bw.write("yj");
        		break;
        	}
        	
        	else if(Yu>4) {
        		bw.write("yt");
        		break;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class