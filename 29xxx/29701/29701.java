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
        
        // 문자열의 길이 N, 문자열 입력
        int N = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 모스 부호 해독
        while(N--!=0) {
        	
        	String morse = st.nextToken();
        	
        	// 모스부호가 1자리인 경우
        	if(morse.length()==1) {
        		if(morse.equals("."))
        			bw.write("E");
        		
        		else
        			bw.write("T");
        	}
        	
        	// 모스부호가 2자리인 경우
        	else if(morse.length()==2) {
        		if(morse.equals(".-"))
        			bw.write("A");
        		
        		else if(morse.equals(".."))
        			bw.write("I");
        		
        		else if(morse.equals("--"))
        			bw.write("M");
        		
        		else
        			bw.write("N");
        	}
        	
        	// 모스부호가 3자리인 경우
        	else if(morse.length()==3) {
        		if(morse.equals("-.."))
        			bw.write("D");
        		
        		else if(morse.equals("--."))
        			bw.write("G");
        		
        		else if(morse.equals("-.-"))
        			bw.write("K");
        		
        		else if(morse.equals(".-."))
        			bw.write("R");
        		
        		else if(morse.equals("..."))
        			bw.write("S");
        		
        		else if(morse.equals("..-"))
        			bw.write("U");
        		
        		else if(morse.equals(".--"))
        			bw.write("W");
        		
        		else
        			bw.write("O");
        	}
        	
        	// 모스부호가 4자리인 경우
        	else if(morse.length()==4) {
        		if(morse.equals("-..."))
        			bw.write("B");
        		
        		else if(morse.equals("-.-."))
        			bw.write("C");
        		
        		else if(morse.equals("..-."))
        			bw.write("F");
        		
        		else if(morse.equals("...."))
        			bw.write("H");
        		
        		else if(morse.equals(".---"))
        			bw.write("J");
        		
        		else if(morse.equals(".-.."))
        			bw.write("L");
        		
        		else if(morse.equals(".--."))
        			bw.write("P");
        		
        		else if(morse.equals("--.-"))
        			bw.write("Q");
        		
        		else if(morse.equals("...-"))
        			bw.write("V");
        		
        		else if(morse.equals("-..-"))
        			bw.write("X");
        		
        		else if(morse.equals("-.--"))
        			bw.write("Y");
        		
        		else
        			bw.write("Z");
        	}
        	
        	// 모스부호가 5자리인 경우
        	else if(morse.length()==5) {
        		if(morse.equals(".----"))
        			bw.write("1");
        		
        		else if(morse.equals("..---"))
        			bw.write("2");
        		
        		else if(morse.equals("...--"))
        			bw.write("3");
        		
        		else if(morse.equals("....-"))
        			bw.write("4");
        		
        		else if(morse.equals("....."))
        			bw.write("5");
        		
        		else if(morse.equals("-...."))
        			bw.write("6");
        		
        		else if(morse.equals("--..."))
        			bw.write("7");
        		
        		else if(morse.equals("---.."))
        			bw.write("8");
        		
        		else if(morse.equals("----."))
        			bw.write("9");
        		
        		else
        			bw.write("0");
        	}
        	
        	// 모스부호가 6자리인 경우
        	else {
        		if(morse.equals("--..--"))
        			bw.write(",");
        		
        		else if(morse.equals(".-.-.-"))
        			bw.write(".");
        		
        		else if(morse.equals("..--.."))
        			bw.write("?");
        		
        		else if(morse.equals("---..."))
        			bw.write(":");
        		
        		else if(morse.equals("-....-"))
        			bw.write("-");
        		
        		else
        			bw.write("@");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class