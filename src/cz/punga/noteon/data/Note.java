package cz.punga.noteon.data;

public enum Note{
	C(0,B,CS),CS(1,C,D),DB(1,C,D),D(2,DB,DS),DS(3,D,E),EB(3,D,E),E(4,EB,F),F(5,E,FS),FS(6,F,G),GB(6,F,G),G(7,GB,GS),GS(8,G,A),AB(8,G,A),A(9,AB,AS),AS(10),BB(10,A,B),B(11,BB,C);
	final int sm;
	Note prev;
	Note next;
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
	private Note(int sm,Note prev,Note next){
		this.sm=sm;
		this.next=next;
		this.prev=prev;
	}
	public Note add(Interval a){
		int s = (sm+a.getSemitones())%12;
		Note n=this;
		for(int i=0;i<s;i++)
			n=n.next();
		return n;
	}
	public Note next(){
		return next;
	}
	public Note prev(){
		return prev;
	}
}
