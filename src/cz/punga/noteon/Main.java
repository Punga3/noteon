package cz.punga.noteon;

import cz.punga.noteon.data.*;

public class Main{
	public static void main(String[] args){
			for(Note n : Note.values())
				System.out.println(n.intervalTo(Note.B));
	}
}
