package com.syntax.class25;

public class OverloadingFinalMethod {

	public final void loveJava() {
		System.out.println("Each programmer loves Java");
	}

}
class SyntaxProgrammer extends OverloadingFinalMethod{
	
	public final void loveJava(String student) {
		System.out.println("Syntax Programmers love Java even more. Especially student " + student);
	}
	
}

