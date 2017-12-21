package in.javacomics.misc.binding;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class ValidationErrorHandler implements ErrorHandler {

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		System.out.println("Warning:");
		exception.printStackTrace();
		
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.out.println("Error:");
		exception.printStackTrace();
		
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		System.out.println("Fatal Error");
		exception.printStackTrace();
		
	}

}
