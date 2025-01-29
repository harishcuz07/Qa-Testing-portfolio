package ThrowAndNewException;

public class UserDefinedExceptionConcept {

	public void amul() throws Exception {

		throw new Exception();
	}
	
	public static void main(String[] args) throws Exception {
		UserDefinedExceptionConcept io = new UserDefinedExceptionConcept();
		io.amul();
	}

	}

