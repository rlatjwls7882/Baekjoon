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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        String L = st.nextToken();
        
        // N번째 학생의 라벨 확인
        int label=0;
        for(;N!=0;) {
        	label++;
        	if(String.valueOf(label).indexOf(L)==-1) N--;
        }
        
        bw.write(label+"");
        
        bw.close();
    } // end of main
} // end of Main class