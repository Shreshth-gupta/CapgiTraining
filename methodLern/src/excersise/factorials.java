package excer;

public class factorials {
    public int facter(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*facter(n-1);
    }
}
