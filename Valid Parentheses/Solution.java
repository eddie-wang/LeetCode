 public class Solution {
     char [] stack;
     int top=-1; 
    public boolean isValid(String s) {
        int n=s.length();
        stack=new char [n];
        for(int i=0;i<n;i++){
        	char cur=s.charAt(i);
        	if(isleft(cur)){
        		push(cur);
        	}
        	else
        	if(isright(cur)){
        		if(top==-1||!match(cur,pop()))
        		    return false;
        	}
        }
        if(top==-1)
        return true; 
        else
        return false; 	
    }
    boolean match(char b, char a)
    {
    	if(a=='('&&b==')'||a=='['&&b==']'||a=='{'&&b=='}')
    		return true;
    	else
    		return false;
    }
    void push(char c){
    	stack[++top]=c;
    }
    char pop(){
    	return stack[top--];
    }
    boolean isleft(char c){
    	return (c=='('||c=='{'||c=='[');
    }
    boolean isright(char c){
    	return (c==')'||c=='}'||c==']');
    }
    public static void main(String[] args) {
    	Solution s=new Solution();
    	 System.out.println(s.isValid(args[0]));
    }
}