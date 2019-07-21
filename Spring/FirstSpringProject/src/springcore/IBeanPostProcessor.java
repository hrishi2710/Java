package springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class IBeanPostProcessor implements BeanPostProcessor, Ordered{
	
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException{
		System.out.println("Processing bean instance after initialization(just after init lifecycle event) of:"+ arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException{
		System.out.println("Processing bean instance before initialization(just before init lifecycle event but after bean is instantiated) of:"+ arg1);
		
		return arg0;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}
