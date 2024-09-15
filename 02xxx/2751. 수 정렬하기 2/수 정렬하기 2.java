import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // N 입력
        int N = Integer.valueOf(br.readLine());
        
        // N개의 정수 오름차순으로 정렬
        TreeSet<Integer> sort = new TreeSet<Integer>();
        
        for(int i=0;i<N;i++)
        	sort.add(Integer.valueOf(br.readLine()));
        
        // 오름차순으로 출력
        Iterator<Integer> it = sort.iterator();
        
        for(int i=0;i<N;i++)
        	bw.write(it.next()+"\n");
        
        bw.close();
    } // end of main
} // end of Main class
