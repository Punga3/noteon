package cz.punga.noteon.data;

public enum Note{
	C(0),CS(1),DB(1),D(2),DS(3),EB(3),E(4),F(5),FS(6),GB(6),G(7),GS(8),AB(8),A(9),AS(10),BB(10),B(11);
	final int sm;
	public int getSemitones(){
		return sm;
	}
	public Interval intervalTo(Note n){
		int a = sm;
		int b = n.getSemitones();
		int s = b-a;
		if(a>b)
			s = (s+12)%12;	
		return Interval.get(s);
	}
	private Note(int sm){
		this.sm=sm;
	}
}
