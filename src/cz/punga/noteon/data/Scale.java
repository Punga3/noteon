package cz.punga.noteon.data;

import cz.punga.noteon.data.Interval;

public enum ChordFlavour{
	private final Interval[] intervals;
	public Interval[] getIntervals(){
		return intervals;
	}
	private ChordFlavour(Interval... i){
		intervals=i;
	}
}
