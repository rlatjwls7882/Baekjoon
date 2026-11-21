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
        
        while(true) {
        	
        	// 녹아 있는 루 R0, 포함된 물 W0, 만들고 싶어하는 카레의 농도 C, 루 1개의 질량 R 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double R0 = Double.valueOf(st.nextToken());
        	double W0 = Double.valueOf(st.nextToken());
        	double C = Double.valueOf(st.nextToken());
        	double R = Double.valueOf(st.nextToken());
        	
        	if(R0==0) break;
        	
        	// 농도 C의 카레를 만들기 위해 추가해야 하는 루의 개수의 최솟값 출력
        	// C = (R0 + XR) / (W0 + 추가하는 물)
        	
        	int X = (int)Math.ceil((C*W0-R0)/R);
        	if(X<0) X=0;
        	
        	bw.write(X+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class