package ro.ibt.querybuildercreator.exceptions;

public class RuleConstructionException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1864938751153281697L;

	public RuleConstructionException(String message) {

		super(message);
	}

	public RuleConstructionException(String message, Throwable cause) {

		super(message, cause);
	}
}
