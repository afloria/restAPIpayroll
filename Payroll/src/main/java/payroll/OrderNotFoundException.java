package payroll;

@SuppressWarnings("serial")
class OrderNotFoundException extends RuntimeException {

	OrderNotFoundException(Long id) {
		super("Id: " + id + " could not be found");
	}
}