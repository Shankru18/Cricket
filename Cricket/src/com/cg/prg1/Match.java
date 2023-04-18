package com.cg.prg1;

public abstract class Match {
	private int currentScore;
	private float currentOver;
	private int targetScore;
	
	public abstract float calculateRunrate();
	public abstract int calculateBalls();
	public void display(double reqRunRate,int balls) {
		
		System.out.println("reqRunRate is  "+String.format("%.2f", reqRunRate));
		System.out.println("Need "+ (targetScore-currentScore) + " runs from " +balls + " balls");
		System.out.println("\n");
		
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	
	
}
