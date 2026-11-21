import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 루트 노드
		Node root = new Node('A', null, null);
		
		// 노드의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 정점 입력
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char data = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			addNode(root, data, left, right);
		}
		
		// 전위 순회
		preorder(root);
		bw.newLine();
		
		// 중위 순회
		inorder(root);
		bw.newLine();
		
		// 후위 순회
		postorder(root);
		
		bw.close();
	} // end of main()
	
	static void addNode(Node node, char data, char left, char right) {
		if(node.data==data) {
			if(left!='.') {
				node.left = new Node(left, null, null);
			}
			if(right!='.') {
				node.right = new Node(right, null, null);
			}
		} else {
			if(node.left!=null) {
				addNode(node.left, data, left, right);
			}
			if(node.right!=null) {
				addNode(node.right, data, left, right);
			}
		}
	} // end of addNode()
	
	static void preorder(Node node) throws IOException {
		if(node==null) {
			return;
		}
		
		bw.write(node.data);
		preorder(node.left);
		preorder(node.right);
	} // end of preorder()
	
	static void inorder(Node node) throws IOException {
		if(node==null) {
			return;
		}
		
		inorder(node.left);
		bw.write(node.data);
		inorder(node.right);
	} // end of inorder()
	
	static void postorder(Node node) throws IOException {
		if(node==null) {
			return;
		}
		
		postorder(node.left);
		postorder(node.right);
		bw.write(node.data);
	} // end of postorder()
} // end of Main class

class Node {
	char data;
	Node left, right;
	
	public Node(char data, Node left, Node right) {
		this.data=data;
		this.left=left;
		this.right=right;
	}
} // end of Node class