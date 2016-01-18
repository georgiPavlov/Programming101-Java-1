package Tasks;

import java.util.Scanner;

public class calc {
	
	String expression;
	
	public calc(String expr){
		expression=expr;
	}
	
	double sum(double x,double y){
		return x + y;
	}
	double subtract(double x,double y){
		return x-y;
	}
	double multiply(double x,double y){
		return x*y;
	}
	double divide(double x,double y){
		return x/y;
	}
	boolean isValid(String expr){
		int i=0;
		boolean isValid=true;
		for(i=0;i<expr.length();i++){
			if(!Character.isDigit(expr.charAt(i)) && expr.charAt(i)!='(' && expr.charAt(i)!=')' && expr.charAt(i)!='*'
					&& expr.charAt(i)!='/' && expr.charAt(i)!='+' && expr.charAt(i)!='-' && expr.charAt(i)!='.'){
				isValid=false;
			}
		}
		return isValid;
	}
	
	public String getSimpleExpression(String expr){		
		String simpleExpression = expr.substring(expr.lastIndexOf('('),expr.indexOf(')'));
		
	}
	
	public double parseSimpleExpression(String expr){
		double result=0;
		int signIndex=0;
		StringBuilder builder = new StringBuilder();
		if(expr.length()>3){
			if(expr.lastIndexOf('*')!=-1){
				signIndex = expr.lastIndexOf(signIndex);
				result = result + sum(expr.charAt(signIndex-1) , expr.charAt(signIndex+1));
				builder.append(expr.substring(0,signIndex-2));
				builder.append(result);
				builder.append(expr.substring(signIndex+2,expr.length()));
				parseSimpleExpression(builder.toString());
			}
			else if(expr.lastIndexOf('/')!=-1){
				signIndex = expr.lastIndexOf(signIndex);
				result = result + sum(expr.charAt(signIndex-1),expr.charAt(signIndex)+1);
				builder.append(expr.substring(0,signIndex-2));
				builder.append(result);
				builder.append(expr.substring(signIndex+2,expr.length()));
				parseSimpleExpression(builder.toString());
			}
			else if(expr.lastIndexOf('+')!=-1){
				signIndex = expr.lastIndexOf(signIndex);
				result = result + sum(expr.charAt(signIndex-1),expr.charAt(signIndex)+1);
				builder.append(expr.substring(0,signIndex-2));
				builder.append(result);
				builder.append(expr.substring(signIndex+2,expr.length()));
				parseSimpleExpression(builder.toString());
			}
			else if(expr.lastIndexOf('-')!=-1){
				signIndex = expr.lastIndexOf(signIndex);
				result = result + sum(expr.charAt(signIndex-1),expr.charAt(signIndex)+1);
				builder.append(expr.substring(0,signIndex-2));
				builder.append(result);
				builder.append(expr.substring(signIndex+2,expr.length()));
				parseSimpleExpression(builder.toString());
			}
		}
		else {
			
		}
		
		return result;
	}
	
	
	
}
