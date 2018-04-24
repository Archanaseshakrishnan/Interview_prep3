package leetcode;

import java.util.Stack;

public class calculator {	
	
	    public int calculate(String s) {
			
	        Stack<Character> operator = new Stack<Character>();
	        Stack<Integer> operand = new Stack<Integer>();
	        int limit=s.length();
	        String operandnow="";
	        for(int i=0;i<limit;i++){
	           /* System.out.println(operator);
	            System.out.println(operand);*/
	        	switch(s.charAt(i)){
	                    
	        	case ' ':
	        		//do nothing
	        		break;
	        	case '+':
	        		int number=Integer.parseInt(operandnow);
	        		operand.push(number);
	        		operandnow="";
	        		if(operator.size()==0){
	        			operator.push('+');
	        		}
	        		else{
	        			while(!operator.isEmpty() && !operand.isEmpty() && operand.size()>=2){
	        				char op=operator.pop();
	        				int num2 = operand.pop();
	        				int num1 = operand.pop();
	        				int result = evaluate(num1,num2,op);
	        				operand.push(result);
	        			}
	                    operator.push('+');
	        		}
	        		break;
	        	case '-':
	        		int number1=Integer.parseInt(operandnow);
	        		operand.push(number1);
	        		operandnow="";
	        		if(operator.size()==0){
	        			operator.push('-');
	        		}
	        		else{
	        			while(!operator.isEmpty() && !operand.isEmpty() && operand.size()>=2){
	        				char op=operator.pop();
	        				int num2 = operand.pop();
	        				int num1 = operand.pop();
	        				int result = evaluate(num1,num2,op);
	        				operand.push(result);
	        			}
	                    operator.push('-');
	        		}
	        		break;
	        	case '*':
	        		int number2=Integer.parseInt(operandnow);
	        		operand.push(number2);
	        		operandnow="";
	        		if(operator.size()==0){
	        			operator.push('*');
	        		}
	        		else{
	        			while(!operator.isEmpty() && !operand.isEmpty() && operand.size()>=2 && (operator.peek()!='+' && operator.peek()!='-')){
	        				char op=operator.pop();
	        				int num2 = operand.pop();
	        				int num1 = operand.pop();
	        				int result = evaluate(num1,num2,op);
	        				operand.push(result);
	        			}
	                    operator.push('*');
	        		}
	        		break;
	        	case '/':
	        		int number3=Integer.parseInt(operandnow);
	        		operand.push(number3);
	        		operandnow="";
	        		if(operator.size()==0){
	        			operator.push('/');
	        		}
	        		else{
	        			while(!operator.isEmpty() && !operand.isEmpty() && operand.size()>=2 && (operator.peek()!='+' && operator.peek()!='-')){
	        				char op=operator.pop();
	        				int num2 = operand.pop();
	        				int num1 = operand.pop();
	        				int result = evaluate(num1,num2,op);
	        				operand.push(result);
	        			}
	                    operator.push('/');
	        		}
	        		break;
	        		
	        	default:
	        		operandnow+=s.charAt(i);
	        	}
	        }
	        /*
	        System.out.println(operator);
	            System.out.println(operand);*/
	        if(!operandnow.equals("")){
	            operand.push(Integer.parseInt(operandnow));
	        }
	        while(!operator.isEmpty() && !operand.isEmpty()){
	            char op=operator.pop();
	        				int num2 = operand.pop();
	        				int num1 = operand.pop();
	        				int result = evaluate(num1,num2,op);
	        				operand.push(result);
	        }
			return operand.pop();        
	    }

		private int evaluate(int num1, int num2, char op) {
			// TODO Auto-generated method stub
			switch(op){
			case '+':
				return num1+num2;
			case '-':
				return num1-num2;
			case '*':
				return num1*num2;
			case '/':
				return num1/num2;
			case '^':
				return num1^num2;
			}
			return 0;
		}
	
}
