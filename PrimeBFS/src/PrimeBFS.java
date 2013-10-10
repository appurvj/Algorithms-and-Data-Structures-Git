import java.util.HashSet;
import java.util.LinkedList;



public class PrimeBFS 
{
	static boolean []isPrime;
        static LinkedList<Integer> primes = new LinkedList<Integer>();

        public static void main(String[] args){
		generatePrimes(10000);
		PrimeBFS p6=new PrimeBFS();
		System.out.println(p6.calcSteps(1033, 8179));
		
	} 
        
	private LinkedList<Integer> getReachablePrimes(String check) {
            LinkedList<Integer> reachableList = new LinkedList<Integer>();
            for(int key : primes){
                int differenceCount=0;
                for(int i=0;i<4;i++)
                    if(check.charAt(i)!=(key+"").charAt(i))
                        differenceCount++;

                if(differenceCount==1)
                    reachableList.add(key);
            }
            return reachableList;
	}
        
	private static void generatePrimes(int number) {
            isPrime = new boolean[number+1];
            for(int i=2;i<=number;i++)
                    isPrime[i]=true;

            for(int i=2;i*i <= number;i++)
                if(isPrime[i])
                    for(int j=i;i*j<=number;j++)
                        isPrime[i*j]=false;

            for(int i = 1000; i <= number;i++ )
                if(isPrime[i])
                    primes.add(i);
	}
	
	public int calcSteps(int val, int reqVal){
            HashSet<Integer> visited = new HashSet<Integer>();
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.add(val);
            int count = 0, level = 0;
            int currVal;
            while(!list.isEmpty()){
                count = list.size();
                while(count-- > 0){
                    currVal  = list.remove();
                    visited.add(currVal);
                    
                    if(currVal==reqVal)
                        return level;

                    for(int num:getReachablePrimes(currVal+""))
                        if(!visited.contains(num)){
                            visited.add(num);
                            list.add(num);
                        }
                }
                level++;
            }
            return -1;
	}
}