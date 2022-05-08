package exam3;

public class TooYoungException extends RuntimeException {
	
	public TooYoungException()
	{
		super("Birth date must be 8/8/888 or before");
	}

}
