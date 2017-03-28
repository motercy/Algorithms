import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {
	private Average() { }
	
	public static void main(String[] args) {
		int count = 0;       // number input values
        double sum = 0.0;    // sum of input values
        
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            count++;
        }

        // compute the average
        double average = sum / count;

        // print results
        StdOut.println("Average is " + average);

	}

}
