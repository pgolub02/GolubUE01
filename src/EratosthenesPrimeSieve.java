public class EratosthenesPrimeSieve implements PrimeSieve{

    private int runTill = -1;

    public EratosthenesPrimeSieve(int runTill){
        this.runTill = runTill;
    }

    @Override
    public boolean isPrime(int p) {
        boolean prime[] = new boolean[p+1];

        for(int i=0;i<=p;++i) {
            prime[i] = true;
        }
        for(int i = 2;i*i <=p;++i)
        {
            if(prime[i] == true)
            {
                for(int j = i*i; j <= p;j+=i) {
                    prime[j] = false;
                }
            }
        }
        return prime[p];
    }

    @Override
    public void printPrimes() {
        boolean prime[] = new boolean[runTill+1];

        for(int i=0;i<=runTill;++i) {
            prime[i] = true;
        }
        for(int i = 2;i*i <=runTill;++i)
        {
            if(prime[i] == true)
            {
                for(int j = i*i; j <= runTill;j+=i) {
                    prime[j] = false;
                }
            }
        }
        for(int i = 2;i < prime.length;++i){
            if(prime[i] == true){
                System.out.println(i);
            }
        }
    }
}