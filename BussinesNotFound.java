package classwork13;

public class BussinesNotFound extends RuntimeException {
	private String message;

	public BussinesNotFound(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return buildMessage(message);
	}
	
	private String buildMessage(String message) {
		StringBuilder sb = new StringBuilder("Bussines with name");
		sb.append(message);
		sb.append("is not found");
		return sb.toString();
	}
	
}
