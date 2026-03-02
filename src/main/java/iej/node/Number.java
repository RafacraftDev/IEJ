package iej;

import iej.node.Node;

public class Number extends Node {
	private Number(int i, int j) {
		super("[" + i + "-" + j + "]");
	}
	private Number(int i) {
		super("[" + i + "]");
	}
	
	public static Number of(int i) {
		return new Number(i);
	}
	public static Number of(int i, int j) {
		return new Number(i, j);
	}
}
