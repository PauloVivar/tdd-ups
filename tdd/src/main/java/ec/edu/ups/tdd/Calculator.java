package ec.edu.ups.tdd;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Calculator {

  private int ans;

	public static void main(String[] args) {
		//SpringApplication.run(Calculator.class, args);
    System.out.println("Hola mundo");
    
	}
  public int addition(int a, int b){
    return a + b;
  }

  public int subtraction(int a, int b){
    return a - b;
  }

  public int division(int a, int b){
    return a / b;
  }

  public int multiplication(int a, int b){
    try {
      Thread.sleep(100);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return a * b;
  }

  public int getAns(){
    return ans;
  }
  
  public void setAns(int ans) {
    this.ans = ans;
  }
}
