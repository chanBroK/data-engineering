package com.khc.kmooc.data_engineering.week1;

public class Email {
	int from;
	int to;

	public Email(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return from + "->" + to;
	}

}
