import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 8*8 크기의 체스판의 상태 입력
        String[] board = new String[8];
        
        for(int i=0;i<8;i++)
        	board[i] = br.readLine();
        
        // 하양 칸의 말의 개수 계산
        int cnt=0;
        
        for(int row=0;row<8;row++)
        	for(int column=0;column<8;column++)
        		if(row%2==0&&column%2==0||row%2==1&&column%2==1)
        			if(board[row].charAt(column)=='F')
        				cnt++;
        
        // 하양 칸의 말의 개수 출력
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class