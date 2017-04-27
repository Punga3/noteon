package cz.punga.noteon.data;

public enum Interval{
	U(0),m2(1),M2(2),m3(3),M3(4),P4(5),TT(6),P5(7),m6(8),M6(9),m7(10),M7(11);
	final int sm;
	public int getSemitones(){
		return sm;
	}
	public static Interval get(int sm){
		for(Interval n:Interval.values())
			if(n.getSemitones()==sm%12)
				return n;
		return null;
	}
	private Interval(int sm){
		this.sm=sm;
	}
}
