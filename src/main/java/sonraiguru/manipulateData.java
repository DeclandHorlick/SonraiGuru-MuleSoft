package sonraiguru;

import java.util.HashMap;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class manipulateData extends AbstractMessageTransformer{
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		
		
		//HashMap myTransactions = (HashMap) message.getPayload();
		//myTransactions.data.accountTransactions[1].amount;
		
		
		return message;
	
	}
}
