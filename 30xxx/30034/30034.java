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
        
        StringBuilder delimeter = new StringBuilder(" ");
        
        // N개의 문자 구분자 입력
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        while(N--!=0) {
        	String tmp = st.nextToken();
        	
        	if(delimeter.indexOf(tmp)==-1)
        		delimeter.append(tmp);
        }
        
        // M개의 숫자 구분자 입력
        int M = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        while(M--!=0) {
        	String tmp = st.nextToken();
        	
        	if(delimeter.indexOf(tmp)==-1)
        		delimeter.append(tmp);
        }
        
        // K개의 병합자 입력
        int K = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        while(K--!=0)
        	try {
        		delimeter.deleteCharAt(delimeter.indexOf(st.nextToken()));
			} catch (Exception e) {}
        
        // 길이 S의 문자열을 나눠서 출력
        int S = Integer.valueOf(br.readLine());
        st = new StringTokenizer(br.readLine(), delimeter.toString());
        
        while(st.hasMoreTokens())
        	bw.write(st.nextToken()+"\n");
        
        bw.close();
    } // end of main
} // end of Main class