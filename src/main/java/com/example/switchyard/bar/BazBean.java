package com.example.switchyard.bar;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(Baz.class)
public class BazBean implements Baz {

	Logger LOG = Logger.getLogger(BazBean.class);
	
	@Override
	public String message(String message) {
		LOG.info("message:" + message);
		return message;
	}

}
