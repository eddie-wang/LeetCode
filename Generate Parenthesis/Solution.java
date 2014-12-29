import java.util.*;
public class Solution{
    List<String> result =new ArrayList<String>();
    char stack[];
    int top=-1;
    int nleft;
    int nright; 
	public List<String> generateParenthesis(int n){
		String cur="";
		stack= new char[n];
		nleft=n;
		nright=n; 
		regenerate(cur,stack);
		return result;
	}
	void regenerate(String cur, char stack[]){
		if(nleft==0&&nright==0){
			result.add(cur);
			return ;
		}
		if(nleft>0){
			push('(');
			nleft--;
			regenerate(cur+"(", stack);
			pop();
			nleft++;	

		}
		if(nright>0){
			if(empty())
			 return;
			char t=pop();
			if(t=='('){
			  nright--;
			  regenerate(cur+")",stack);
			  nright++;
			  push('(');
			}
			else
			return ;	
		}

	}
	void push(char c){
		stack[++top]=c;

	}
	char pop(){
		return stack[top--];
	}
	boolean empty(){
		return top==-1;
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		Solution s=new Solution();
		for (String a:s.generateParenthesis(n)){
			System.out.println(a);
		}
	}
}