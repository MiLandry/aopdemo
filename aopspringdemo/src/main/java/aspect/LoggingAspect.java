package aspect;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//this makes this class an aspect
@Aspect
public class LoggingAspect
{
	@Before("execution(public String getName())") //the LoggingAdvice method is called before the execution of this method signature.
	public void LoggingAdvice() 
	{
		
		System.out.println("Advice run. Get Method called");
		
	}

}
