package cz.punga.noteon;

import cz.punga.noteon.data.*;

public class Main{
	public static void main(String[] args){
			for(Note n : Note.values()){
				System.out.print(n);
				for(Interval i:ChordFlavour.M.getIntervals())
					System.out.print(","+n.add(i));
				System.out.println();
			}	
	}
}
