import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private int runTill = -1;

    public EratosthenesPrimeSieve(int runTill){
        this.runTill = runTill;
    }

    @Override
    public boolean isPrime(int p) {
        List<Boolean> prime = new ArrayList<Boolean>();

        for(int i = 0;i <= p;++i) {
            prime.add(true);
        }
        for(int i = 2;i*i <= p;++i){
            if(prime.get(i) == true){
                for(int j= i*i;i <= p;j += i){
                    prime.set(j, false);
                }
            }
        }
        return prime.get(p+1);
    }

    @Override
    public void printPrimes() {

    }
}
