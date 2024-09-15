import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 5개의 정수 입력
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for(int i=0;i<5;i++)
    		list.add(Integer.valueOf(br.readLine()));
    	list.sort(null);
    	
    	// 평균과 중앙값 출력
    	int average = 0;
    	
    	for(int i=0;i<5;i++)
    		average+=list.get(i);
    	
    	bw.write(average/5+"\n"+list.get(2));
    	bw.close();
    } // end of main
} // end of Main class