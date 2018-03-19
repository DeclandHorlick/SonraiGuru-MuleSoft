package sonraiguru;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class loginProcessor extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		
		String currentPayload =  message.getPayload().toString();
		String[] login = currentPayload.split("\"");
		System.out.println(login);
		String passWord = login[7];
		String userName = login[3];
		
		message.setProperty("userName",  userName, PropertyScope.INVOCATION);
		message.setProperty("passWord",  passWord, PropertyScope.INVOCATION);
		
		return message;
		
	}

}