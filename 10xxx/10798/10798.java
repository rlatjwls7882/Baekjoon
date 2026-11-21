import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 5줄 입력
    	char[][] arr = new char[5][];
    	for(int i=0;i<5;i++)
    		arr[i] = bf.readLine().toCharArray();
    	
    	// 배열을 세로로 읽어 출력
    	for(int i=0;i<15;i++) {
    		
    		// IndexOutofBoundsException 예외처리
    		for(int j=0;j<5;j++)
    		try {
    				bw.write(arr[j][i]);
			} catch (Exception e) {}
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class