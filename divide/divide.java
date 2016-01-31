public Solution4{
	 public int divide(int dividend, int divisor) {
	 	boolean negative=dividend>0&&divisor<0||dividend<0&&divisor>0;
	 	dividend=Math.abs(dividend);
	 	divisor=Math.abs(divisor);
	 	int digit=0;
	 	while((dividend>>1)>=divisor)
	 	{
	 		divisor<<1;
	 		digit++;
	 	}
	 	while(digit>=0){
	 		if(dividend>=divisor){
	 			dividend-=divisor;
	 			ans+=1<<digit;
	 		}
	 		divisor>>1;
	 		digit--;
	 	}
	 }
}