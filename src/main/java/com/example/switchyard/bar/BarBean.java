package com.example.switchyard.bar;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(Bar.class)
public class BarBean implements Bar {

	private static final Logger LOG = Logger.getLogger(BarBean.class);
	
	@Override
	public String message(String message) {
		System.out.println("message()");
		return message.toLowerCase();
	}

	@Override
	public String complexMessage(ComplexMessage complexMessage) {
		LOG.info("complexMessage():"+ complexMessage.getMessage());
		return complexMessage.getMessage().toLowerCase();
	}
	
	@Override
	public boolean sample(String string){
		LOG.info("sample() - start");
		return string.isEmpty();
	}

	@Override
	public boolean sampleTwo(String input) throws Exception {
		LOG.info("sampleTwo() - start");
		return input.isEmpty();
	}

	@Override
	public Boolean sampleThree(String input) throws Exception {
		LOG.info("sampleThree() - start");
		return input.isEmpty();
	}
}
