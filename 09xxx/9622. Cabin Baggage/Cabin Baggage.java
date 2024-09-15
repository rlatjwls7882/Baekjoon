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
        
        // 가방의 개수 t
        int t = Integer.valueOf(br.readLine());
        
        // 허용되는 캐리어의 개수 계산
        int totalNum=0;
        
        while(t--!=0) {
        	
        	// 높이 가로 세로 무게
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	Double length = Double.valueOf(st.nextToken());
        	Double width = Double.valueOf(st.nextToken());
        	Double depth = Double.valueOf(st.nextToken());
        	Double weight = Double.valueOf(st.nextToken());
        	
        	// 캐리어가 허용되는지 확인
        	if(weight<=7&&(length<=56&&width<=45&&depth<=25||length+width+depth<=125)) {
        		totalNum++;
        		bw.write("1\n");
        	}
        	
        	else
        		bw.write("0\n");
        }
        
        bw.write(totalNum+"");
        
        bw.close();
    } // end of main
} // end of Main class