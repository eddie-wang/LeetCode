public class Solution{
	 public int atoi(String str) {
	 	int number=0;
	 	int i=0;
	 	int n=str.length();
	 	int sign=1;
	 	if(n==0) return 0;
	 	while(i<n&&str.charAt(i)==' ')
	 	   i++;
	 	if(i<n&&(str.charAt(i)=='-'|str.charAt(i)=='+')){
	 		int temp=str.charAt(i)=='-'?-1:1;
	 		sign*=temp;
            i++; 
	 	}
	 	while(i<n&&str.charAt(i)<'9'&&str.charAt(i)>'0'){
	 	//	int temp=number;
	 		int add=str.charAt(i)-'0';
	 		number=number*10+add;
	 		if(number%10!=add){    //check if overflow
	 			//System.out.println(sign);
	 			return sign==1?2147483647:-2147483648;
	 		}
	 		//System.out.println(i+" "+n);
	 		i++;
	 	}
	 	//if(number==2147483648&&sign==-1) return 2147483647;
	 	return number*sign;

    }
        
	public static void main(String[] args) {
		Solution s=new Solution();
		int n=s.atoi(args[0]);
	    System.out.println(n);
	}
}