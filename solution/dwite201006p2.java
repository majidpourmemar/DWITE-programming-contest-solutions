/* 
 * DWITE - June 2010 - Problem 2: Sum of Primes
 * Solution by Project Nayuki
 * 
 * http://www.nayuki.io/page/dwite-programming-contest-solutions
 * https://github.com/nayuki/DWITE-programming-contest-solutions
 */


public final class dwite201006p2 extends DwiteSolution {
	
	public static void main(String[] args) {
		new dwite201006p2().run("DATA2.txt", "OUT2.txt");
	}
	
	
	protected void runOnce() {
		int n = io.readIntLine();
		boolean[] isPrime = DwiteAlgorithm.sievePrimes(n);
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			if (isPrime[i])
				sum += i;
		}
		io.println(sum);
	}
	
}
