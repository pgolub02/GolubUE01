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

    public void printStraightNumbers(int o){
        boolean prime[] = new boolean[o+1];

        for(int i=0;i<=o;++i) {
            prime[i] = true;
        }
        for(int i = 2;i*i <=o;++i)
        {
            if(prime[i] == true)
            {
                for(int j = i*i; j <= o;j+=i) {
                    prime[j] = false;
                }
            }
        }
        boolean running = true;
        for(int i = 4;i <= o;i=i+2){
            for(int j = 2;j < prime.length;++j){
                if(prime[j] == true) {
                    for(int b = 2;b < prime.length;++b){
                        if(prime[b] == true) {
                            if((j+b) == i){
                                System.out.println((j+b)+" summe: "+(j+b)+" = "+j+" + "+b);
                                running = false;
                                break;
                            }
                        }
                    }

                }
                if(!running){
                    running = true;
                    break;
                }
            }
        }
    }
}