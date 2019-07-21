package springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class IIBeanPostProcessor implements BeanPostProcessor, Ordered {
	
	@Override
	public Object postProcessAfterInitialization (Object arg0, String arg1) throws BeansException{
		System.out.println("Bean post processor 2 after initialization of:"+arg1);
		return arg0;
	}
	
	public Object postProcessBeforeInitialization (Object arg0, String arg1) throws BeansException{
		System.out.println("Bean post processor 2 before initialization of:"+ arg1);
		return arg0;
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
