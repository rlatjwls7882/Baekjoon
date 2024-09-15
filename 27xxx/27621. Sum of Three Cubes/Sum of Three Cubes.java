import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // X³+Y³+Z³==0~49을 만족하는 X, Y, Z 쌍 생성
        String[] XYZ = {"0 0 0", "0 0 1", "0 1 1", "1 1 1", "0", "0", "-1 -1 2", "0 -1 2"
            , "0 0 2", "0 1 2", "1 1 2", "-2 -2 3", "7 10 -11", "0", "0", "-1 2 2"
            , "-511 -1609 1626", "1 2 2", "-1 -2 3", "0 -2 3", "1 -2 3", "-11 -14 16", "0"
            , "0", "-2901096694 -15550555555 15584139827", "-1 -1 3", "0 -1 3", "0 0 3"
            , "0 1 3", "1 1 3", "-283059965 -2218888517 2220422932", "0", "0"
            , "8866128975287528 -8778405442862239 -2736111468807040", "-1 2 3", "0 2 3"
            , "1 2 3", "0 -3 4", "1 -3 4", "117367 134476 -159380", "0", "0"
            , "-80538738812075974 80435758145817515 12602123297335631", "2 2 3", "-5 -7 8"
            , "2 -3 4", "-2 3 3", "6 7 -8", "-23 -26 31", "0"};
        
        // X³+Y³+Z³==N을 만족하는 X Y Z 출력
        bw.write(XYZ[Integer.valueOf(br.readLine())]);
        
        bw.close();
    } // end of main
} // end of Main class