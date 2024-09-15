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
        
        // 배가 싣고 온 기름의 양, 두 종류의 병의 크기 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.valueOf(st.nextToken());
        int v1 = Integer.valueOf(st.nextToken());
        int v2 = Integer.valueOf(st.nextToken());
        
        // v1 크기의 병의 개수와 v2 크기의 병의 개수 계산
        int v1num=0, v2num=0;
        
        while(s%v1!=0&&s>0) {
        	s -= v2;
        	v2num++;
        }
        
        v1num += s/v1;
        
        // v1 크기의 병의 개수와 v2 크기의 병의 개수 출력
        if(s%v1!=0)
        	bw.write("Impossible");
        else
        	bw.write(v1num+" "+v2num);
        
        bw.close();
    } // end of main
} // end of Main class