package customExceptions;

@SuppressWarnings("serial")
public class AlreadyRegisteredIdException extends IllegalArgumentException{
	private String id;
	
	public AlreadyRegisteredIdException(String i) {
		id = i;
	}
	
	@Override
	public String getMessage() {
		return "The id " + id + " is already registered in the system.";
	}
}