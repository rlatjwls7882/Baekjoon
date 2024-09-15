import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 학생 조의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 2N-1명중 2명이 속하지 않은 조 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        TreeSet<String> group = new TreeSet<String>();
        
        for(int i=0;i<N*2-1;i++) {
        	String student = st.nextToken();
        	
        	if(!group.add(student))
        		group.remove(student);
        }
        
        // 2명이 속하지 않은 조 출력
        bw.write(group.first()+"");
        bw.close();
    } // end of main
} // end of Main class