package NumeroSequencia;

public class NovaFibo {
	 public static boolean quadradoPerfeito(int x) {
	        int s = (int) Math.sqrt(x);
	        return s*s == x;
	    }

	    public boolean pertenceFibonacc(int n) {
	        return quadradoPerfeito(5*n*n + 4) || quadradoPerfeito(5*n*n - 4);
	    }
}
