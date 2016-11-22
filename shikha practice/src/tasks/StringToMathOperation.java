package tasks;

import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class StringToMathOperation {

	public static void main(String[] args) throws ScriptException {
		System.out.println("Enter the formula");
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		ScriptEngineManager sem= new ScriptEngineManager();
		ScriptEngine e= sem.getEngineByName("JavaScript");
		System.out.println(e.eval(s));
		

	}

}
