package com.example.switchyard.bar;

import java.io.File;

import javax.inject.Named;

import org.apache.camel.processor.idempotent.FileIdempotentRepository;
import org.apache.camel.util.LRUCache;

@Named
public class FileRepo extends FileIdempotentRepository  {
	
	public FileRepo() {
		super();
		setFileStore(new File("/tmp/FileRepo"));
		setCache(new LRUCache<String,Object>(100000));		
	}
}
