public class PrimeOptimized {
    // This is also called Sieve of Eratosthenes Method
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n+1];
        sieve(n,prime);
    }
    // False in array means number is prime
    public static void sieve(int n , boolean[] prime){
        for(int i = 2 ; i * i <= n ; i++){
            if(!prime[i]){ // if prime[i] is false
                for(int j = i*2 ; j<= n ; j+=i){
                    prime[j] = true; // mark all multiples of i as false

                }
            }
        }
        for(int i= 2 ; i <= n ; i++){
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
