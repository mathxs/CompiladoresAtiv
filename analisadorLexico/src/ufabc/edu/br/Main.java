package ufabc.edu.br;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    AnalisadorLexico l;
	    l = new AnalisadorLexico("prog.in");
	    while(l.eof() == false) {
		    System.out.println(l.nextToken());
	    }
	}

}
