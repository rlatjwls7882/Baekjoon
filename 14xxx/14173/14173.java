import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int xmin=10, ymin=10, xmax=0, ymax=0;
    	
    	for(int i=0;i<2;i++) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		
    		for(int j=0;j<2;j++) {
    			// x,y 입력
    			int x = Integer.valueOf(st.nextToken());
    			int y = Integer.valueOf(st.nextToken());
    			
    			// x,y의 최대 최소 계산
    			if(xmin>x) xmin=x;
    			if(xmax<x) xmax=x;
    			if(ymin>y) ymin=y;
    			if(ymax<y) ymax=y;
    		}
    	}
    	
    	// 정사각형의 최대 넓이 출력
    	if(xmax-xmin>ymax-ymin)
    		bw.write((xmax-xmin)*(xmax-xmin)+"");
    	else
    		bw.write((ymax-ymin)*(ymax-ymin)+"");
    	bw.close();
    } // end of main
} // end of Main class