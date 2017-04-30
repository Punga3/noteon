package cz.punga.noteon.data;

import cz.punga.noteon.data.Interval;

public enum Scale{
	private final Interval[] intervals;
	public Interval[] getIntervals(){
		return intervals;
	}
	private Scale(Interval... i){
		intervals=i;
	}
}
