package cz.punga.noteon.data;

import cz.punga.noteon.data.Interval;

public enum ChordFlavour{
	M(Interval.M3,Interval.P5),m(Interval.m3,Interval.P5),Aug(Interval.M3,Interval.m6),Dim(Interval.m3,Interval.TT);
	private final Interval[] intervals;
	public Interval[] getIntervals(){
		return intervals;
	}
	private ChordFlavour(Interval... i){
		intervals=i;
	}
}
