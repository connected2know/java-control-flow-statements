package main.java;

public class ControlFlowStatements {

	public void ifThenStatement() {

		if (true)
			System.out.println("true"); // simple example: the print will be always executed because true is always
										// true.

		if (true) { // this produces exactly the same result as the previous expression but here, we
					// use curly braces to define a scope. Everything between the open and closed
					// curly braces will be executed. If we don't use the curly braces, only the
					// first statement after the "if" will be executed (if the "if" condition
					// returns true).

			System.out.println("true");

		}

	}

	public void ifThenElseStatement() {

		String param = "a"; // change this value to have different result

		if ("a".equals(param))
			System.out.println("true");
		else
			System.out.println("false"); // The else part of this control flow statement will be executed if, "a" is
											// different of the "param" received

		if ("a".equals(param)) { // Exactly same result as example above but, with braces defining a block. This
									// allows to put more than one statement inside a control flow branch
			System.out.println("true");
		} else { // using the curly braces allows to add more than one instruction inside the
					// else block

			System.out.println("false");
			System.out.println("Second false");
		}

	}

	public void switchStatement() {

		int position = 2; // we set the position that we want to choose in the below switch clause
		String vowel;

		switch (position) { // in the switch condition we say that we want to use "position" variable as
							// basis to compare.
		case 1:
			vowel = "a"; // in this example, position is different of 1 so, will jump to next case
							// statement
			break; // in the switch, when case is matched, the break command will be called,
					// exiting the switch
		case 2:
			vowel = "e"; // when comparing "position" with integer value 2, a match will be done and
							// vowel will be affected with "e"
			break; // because there was a match in the previous condition, break will be called and
					// no more conditions will be compared
		case 3:
			vowel = "i";
			break;
		case 4:
			vowel = "o";
			break;
		case 5:
			vowel = "u";
			break;
		default:
			vowel = "Invalid vowel"; // default condition is used if no other of previous conditions are matched.
			break;
		}
		System.out.println(vowel); // in this example, the value "e" will be printed
	}

	public void whileStatement() {

		int position = 0; // initializing the position variable that will be used as index inside the
							// while cycle

		while (position < 8) { // the condition for the while is: while position is lesser that 8 do something
								// that is inside the while block (defined by the curly brackets)

			System.out.println(position); // printing the current position value. Because it's inside the switch scope,
											// this will be called in a cycle way, until the while loop exits

			position++; // increment the position value. If we don't do this, position will be less than
						// 8 forever and the cycle will never exit. Because it's inside the switch
						// scope, this will be called in a cycle way, until the while loop exits
		}
	}

	public void doWhileStatement() {

		int position = 0; // initializing the position variable that will be used as index inside the
							// while cycle

		do { // do block. The code inside this scope will be executed always at least once

			System.out.println(position);

			position++; // increment of position to avoid an infinite loop

		}

		while (position < 8); // condition for next execution to occur: position must be lesser than 8

	}

	public void forLoopStatement() {

		for (int position = 0; position < 10; position++) { // we initialize a position variable with 0 and we put the
															// condition that, the loop will execute until position is
															// less than 10. For each execution of the loop we increment
															// the position value.

			System.out.println(position); // simple print of position variable
		}
	}

	public void theForLoopInfiniteLoop1() {

		for (;;) { // this is a way of defining an infinite loop in Java for the for statement. We
					// don't put any condition to exit the cycle.

			System.out.println("loop");
		}
	}

	public void theForLoopInfiniteLoop2() {

		for (int position = 0;;) { // this is another way of defining an infinite loop in Java for the for
									// statement. We define a variable but we never use it to control the number of
									// executions of the loop. Once again, we don't put any condition to exit the
									// cycle.
			System.out.println(position);
		}
	}

	public void theForLoopInfiniteLoop3() {

		for (int position = 0;; position++) { // this is another way of defining an infinite loop in Java for the for
												// statement. We define a variable and we increment it but we don't have
												// a condition to control when the loop should finish. Once again, we
												// don't put any condition to exit the cycle.

			System.out.println(position);
		}
	}

	public void theForLoopInfiniteLoop4() {

		for (int position = 0; position < 10;) { // this is another way of defining an infinite loop in Java for the for
													// statement. We define a variable and put a condition for exiting
													// the loop but we never change the value of position (we could
													// change inside the for block too, but we don't do it)

			System.out.println(position); // simple print position
		}
	}

	public void breakStatement(int number) {

		for (int position = 0; position < 10; position++) {

			System.out.println(position);
			if (number == position) { // if number received as argument is equals to the position variable, we exite
										// the for loop calling the break statement

				break;// break being called and when that happens it will cause the exit the for cycle
			}
		}

		int position = 0;
		while (position < 8) {

			System.out.println(position);
			position++;
			if (number == position) { // if number received as argument is equals to the position variable, we exit
										// the while loop calling the break statement

				break; // break being called and when that happens it will cause the exit the for cycle
			}
		}
	}

	public void continueStatement(int number) {

		for (int position = 0; position < 10; position++) {
			System.out.println(position);
			if (number == position) { // if the number received as argument is equals to the position variable, it
										// will jump to the next cycle of execution and any logic after the continue in
										// this cycle will be ignored
				continue;
			}
		}

		int position = 0;
		while (position < 8) {
			System.out.println(position);
			position++;
			if (number == position) { // if number received as argument is equals to the position variable, it will
										// jump to the next cycle of execution and any logic coming after the continue
										// in this cycle will be ignored

				continue;
			}
		}
	}

	public void returnVoidStatement() {
		// Some logic....
		return; // return nothing. Only exit the method (this return is optional in a void
				// method)

	}

	public Object returnObjectStatement() {

		// Some logic....
		return new Object(); // return an Object

	}

	public int returnPrimitiveStatement() {
		// Some logic....
		return 1; // return an int primitive

	}

	public static void main(String[] args) {
		ControlFlowStatements controlFlowStatements = new ControlFlowStatements();

		/* if then */
		controlFlowStatements.ifThenStatement();

		/* if then else */
		controlFlowStatements.ifThenElseStatement();

		/* switch */
		controlFlowStatements.switchStatement();

		/* while */
		controlFlowStatements.whileStatement();

		/* do while */
		controlFlowStatements.doWhileStatement();

		/* for (not infinite loop) */
		controlFlowStatements.forLoopStatement();

		/* break */
		controlFlowStatements.breakStatement(3);

		/* continue */
		controlFlowStatements.continueStatement(3);
		
		/* return ( primitive ) */
		int result = controlFlowStatements.returnPrimitiveStatement();
		System.out.println(result);
	}

}
