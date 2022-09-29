package com.rev;

public class ReverseNumberGeneratorTest {

	
	 
		private int totalNumberInSequece;
		private boolean evenFlag;
		private int number = 10;
		
		public ReverseNumberGeneratorTest(int totalNumberInSequece) {
			super();
			this.totalNumberInSequece = totalNumberInSequece;
		}
		
		public void printOddNumber() {
			
			synchronized (this) {
				
				while (number!=0) {
					
					while (evenFlag) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					System.out.println(Thread.currentThread().getName()+": "+number);
					
					evenFlag = true;
					notify();
				}
			}
		}
		
		public void printEvenNumber() {
	 
			synchronized (this) {
				
				while (number!=0) {
					
					while (!evenFlag) {
						try {
							wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
					System.out.println(Thread.currentThread().getName()+": "+number);
					number--;
					evenFlag = false;
					notify();
				}
			}
		
		}
	}

