
import java.util.HashSet;


public class Recamen {
    
    public int getSeqNumItr(int count){
        HashSet<Integer> exists = new HashSet<Integer>();
        int[] seq = new int[count+1];
        for(int i = 1; i <= count; i++){
            seq[i] = seq[i-1] - i > 0 && !exists.contains(seq[i-1]-i)?
                    seq[i-1]- i:seq[i-1] + i;
            exists.add(seq[i]);
        }
        return seq[count];
    }
    public static void main(String[] args){
        int[] vals = {50};
        Recamen rec = new Recamen();
        for(int val:vals)
            System.out.println(fibo(val));
    }
    
    public static long fibo(int n){
        long seq[] = new long[n+1];
        seq[1] = 1;
        for(int i = 2; i <=n; i++)
            seq[i] = seq[i-1] + seq[i-2];
        return seq[n];
    }
    
    
//    private HashSet<Integer> set;
//    private int count;
//    public int getSeqNum(int count){
//        if(count < 2)
//            return count;
//        this.count = count;
//        this.set = new HashSet<Integer>();
//        return getNum(0,1,1);
//    }
//    
//    private int getNum(int prev, int curr, int n){
//        if(n==count)
//            return curr;
//        set.add(curr);
//        n++;
//        int next = curr - n > 0 && !set.contains(curr - n)?curr-n:curr+n;
//        return getNum(curr, next, n);
//    }
}
