package com.rev;

public class OddNumberPrinter implements Runnable {
	private ReverseNumberGeneratorTest oddAndEvenBumberGenerator;
	 
	 
	public OddNumberPrinter(ReverseNumberGeneratorTest oddAndEvenBumberGenerator) {
		super();
		this.oddAndEvenBumberGenerator = oddAndEvenBumberGenerator;
	}
 
	@Override
	public void run() {
		oddAndEvenBumberGenerator.printOddNumber();
	}
}
