import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.LinkedList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	
    	int N = Integer.valueOf(br.readLine());
    	LinkedList<Character> opt = new LinkedList<>();
    	LinkedList<BigInteger> list = new LinkedList<>();
    	list.push(new BigInteger(br.readLine()));
    	
    	while(N-->1) {
    		char nextOpt = br.readLine().charAt(0);
    		BigInteger next = new BigInteger(br.readLine());
    		
    		if(nextOpt=='+' || nextOpt=='-') {
    			list.add(next);
    			opt.add(nextOpt);
    		} else if(nextOpt=='*') {
    			list.add(list.pollLast().multiply(next));
    		} else {
    			if(list.getLast().compareTo(BigInteger.ZERO)!=next.compareTo(BigInteger.ZERO)) {    				
    				list.add(list.pollLast().subtract(next.subtract(BigInteger.ONE)).divide(next));
    			} else {
    				list.add(list.pollLast().divide(next));
    			}
    		}
    	}
    	
    	BigInteger val = list.get(0);
    	for(int i=0;i<opt.size();i++) {
    		if(opt.get(i)=='+') {
    			val = val.add(list.get(i+1));
    		} else {
    			val = val.subtract(list.get(i+1));    			
    		}
    	}
    	bw.write(val.toString());
        bw.close();
    } // end of main
} // end of Main class