import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// N개의 중복없는 문자를 오름차순으로 정렬
    	TreeSet<Integer> NumList = new TreeSet<Integer>();
    	
    	// 수의 개수 N 입력
    	int N = Integer.valueOf(bf.readLine());
    	
    	while(N--!=0)
    		NumList.add(Integer.valueOf(bf.readLine()));
    	
    	// 오름차순으로 N개의 수 출력
    	Iterator<Integer> it = NumList.iterator();
    	
    	while(it.hasNext())
    		bw.write(it.next()+"\n");
    	
    	bw.close();
    } // end of main
} // end of Main class