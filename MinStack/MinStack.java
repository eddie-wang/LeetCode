 public class MinStack {
    int [] stack=new int[10];
    int top=-1;
    int size=10;
    int min=0;
    public void push(int x){
    	//panduan size
    	if(top==size-1){
    		int [] temp=stack;
    		stack=new int [size*2];
    		size*=2;
    		System.arraycopy(temp,0,stack,0,top+1);
    	}
    	stack[++top]=x;
    	min=stack[min]<x?min:top;
    }
    public void pop(){
    	if(top!=-1)
    	  top--;
    	if(min==top+1){
    		min=0;
    		for(int i=0;i<=top;i++){
    			if(stack[i]<stack[min])
    				min=i;
    		}
    	}
    }
    public int top(){
    	return stack[top];
    }
    public int getMin(){
    	return stack[min];
    }
     public static void main(String[] args) {
    	Solution s=new Solution();
    	s.push(2);
    	s.push(3);
        System.out.println(s.top() + " "+s.getMin());
    }
}