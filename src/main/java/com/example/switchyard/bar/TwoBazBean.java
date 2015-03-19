package com.example.switchyard.bar;

import org.apache.log4j.Logger;
import org.switchyard.component.bean.Service;

@Service(name="TwoBazBean", value=Baz.class)
public class TwoBazBean implements Baz {

	Logger LOG = Logger.getLogger(TwoBazBean.class);
	
	@Override
	public String message(String message) {
		LOG.info("message:" + message);
		return message;
	}

}
