package com.example.switchyard.bar;

import java.io.File;

import javax.inject.Named;

import org.apache.camel.processor.idempotent.FileIdempotentRepository;
import org.apache.camel.util.LRUCache;
import org.switchyard.component.bean.Service;

@Named
@Service(IFileRepo.class)
public class IFileRepoBean extends FileIdempotentRepository implements
		IFileRepo {
	
	public IFileRepoBean() {
		super();
		setFileStore(new File("/tmp/FileRepoBean"));
		setCache(new LRUCache<String,Object>(100000));
		
	}

}
