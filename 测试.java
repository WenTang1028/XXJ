package 软工;

public class 测试 {
	import java.util.Scanner;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("欢迎使用简单计算器！");
	        System.out.print("请输入第一个数字: ");
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("请输入运算符(+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        
	        System.out.print("请输入第二个数字: ");
	        double num2 = scanner.nextDouble();
	        
	        double result = 0.0;
	        
	        switch(operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                result = num1 / num2;
	                break;
	            default:
	                System.out.println("无效的运算符");
	        }
	        
	        System.out.println("计算结果: " + result);
	        
	        scanner.close();
	    }
	}
}