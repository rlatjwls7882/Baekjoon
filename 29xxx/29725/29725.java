import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 기물 정보와 그에 대한 점수 생성
        char[] object = {'P', 'p', 'N', 'n', 'B', 'b'
        		, 'R', 'r', 'Q', 'q'};
        int[] score = {1, -1, 3, -3, 3, -3, 5, -5, 9, -9};
        
        // 체스판의 기물 점수 계산
        int totalScore=0;
        
        for(int i=0;i<8;i++) {
        	String chessBoard = br.readLine();
        	
        	for(int j=0;j<8;j++)
        		for(int k=0;k<object.length;k++)
        			if(chessBoard.charAt(j)==object[k])
        				totalScore += score[k];
        }
        
        // 체스판의 기물 점수 출력
        bw.write(totalScore+"");
        bw.close();
    } // end of main
} // end of Main class