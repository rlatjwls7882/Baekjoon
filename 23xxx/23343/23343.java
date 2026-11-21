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
        
        // x, y 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        String y = st.nextToken();
        
        // x-y의 값 출력
        try {
        	bw.write(Integer.valueOf(x)-Integer.valueOf(y)+"");
		} catch (Exception e) {
			bw.write("NaN");
		}
        
        bw.close();
    } // end of main
} // end of Main class