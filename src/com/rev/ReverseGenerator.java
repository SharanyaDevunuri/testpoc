package com.rev;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.rev.ReverseNumberGeneratorTest;
import com.rev.EvenNumberPrinter;
import com.rev.OddNumberPrinter;

public class ReverseGenerator {
private static final int TOTAL_NUMBER_IN_SEQUENCE = 1;
	
	public static void main(String[] args) {
		
		ReverseNumberGeneratorTest oddAndEvenNumberGenerator = new ReverseNumberGeneratorTest(TOTAL_NUMBER_IN_SEQUENCE);
		ExecutorService executorService = null;
		try {
			executorService = Executors.newFixedThreadPool(2);
			
			executorService.execute(new OddNumberPrinter(oddAndEvenNumberGenerator));
			executorService.execute(new EvenNumberPrinter(oddAndEvenNumberGenerator));
		} catch (Exception e) {
			e.printStackTrace();
		}finally { 
			if(executorService != null)
				executorService.shutdown();
		}
		
	} 

} 
