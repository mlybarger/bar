package com.example.switchyard.bar;

public interface Bar {
	
	public String message( String message );

	public String complexMessage( ComplexMessage complexMessage );
	
	public boolean sample( String input );
	public boolean sampleTwo( String input ) throws Exception;
	public Boolean sampleThree( String input ) throws Exception;
	
}
