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
        
        // 총 라운드의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// A가 낸 딱지의 그림 확인
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.valueOf(st.nextToken());
        	int[] pictureA = new int[4];
        	
        	while(a-->0)
        		pictureA[Integer.valueOf(st.nextToken())-1]++;
        	
        	// B가 낸 딱지의 그림 확인
        	st = new StringTokenizer(br.readLine());
        	int b = Integer.valueOf(st.nextToken());
        	int[] pictureB = new int[4];
        	
        	while(b-->0)
        		pictureB[Integer.valueOf(st.nextToken())-1]++;
        	
        	// A와 B중 누가 이기는지 출력
        	if(pictureA[3]==pictureB[3]&&pictureA[2]==pictureB[2]&&pictureA[1]==pictureB[1]&&pictureA[0]==pictureB[0])
        		bw.write("D\n");
        	else if(pictureA[3]>pictureB[3]
        			||(pictureA[3]==pictureB[3]&&pictureA[2]>pictureB[2])
        			||(pictureA[3]==pictureB[3]&&pictureA[2]==pictureB[2]&&pictureA[1]>pictureB[1])
        			||(pictureA[3]==pictureB[3]&&pictureA[2]==pictureB[2]&&pictureA[1]==pictureB[1]&&pictureA[0]>pictureB[0]))
        		bw.write("A\n");
        	else
        		bw.write("B\n");
        }

        bw.close();
    } // end of main
} // end of Main class