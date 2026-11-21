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
    	
    	// 파일의 개수, 파일의 크기, 클러스터의 크기
    	int N = Integer.valueOf(br.readLine());
    	StringTokenizer files = new StringTokenizer(br.readLine());
    	double cluster = Double.valueOf(br.readLine());
    	
    	// 사용한 디스크 공간 계산
    	long disk=0;
    	
    	while(N-->0)
    		disk += Math.ceil(Double.valueOf(files.nextToken())/cluster)*cluster;
    	
    	bw.write(disk+"");
    	
    	bw.close();
    } // end of main
} // end of Main class