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
    	
    	// 중심 X,Y 반지름 R 입력
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	double X1 = Double.valueOf(st.nextToken());
    	double Y1 = Double.valueOf(st.nextToken());
    	double R1 = Double.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	double X2 = Double.valueOf(st.nextToken());
    	double Y2 = Double.valueOf(st.nextToken());
    	double R2 = Double.valueOf(st.nextToken());
    	
    	// 두 원이 겹치는지 확인
    	if(Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1))<R1+R2)
    		bw.write("YES");
    	else
    		bw.write("NO");
    	
    	bw.close();
    } // end of main
} // end of Main class