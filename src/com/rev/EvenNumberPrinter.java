package com.rev;

public class EvenNumberPrinter implements Runnable {
	private ReverseNumberGeneratorTest oddAndEvenBumberGenerator;
	 
	 
	public EvenNumberPrinter(ReverseNumberGeneratorTest oddAndEvenBumberGenerator) {
		super();
		this.oddAndEvenBumberGenerator = oddAndEvenBumberGenerator;
	}
 
	@Override
	public void run() {
		oddAndEvenBumberGenerator.printEvenNumber();
	}

}
