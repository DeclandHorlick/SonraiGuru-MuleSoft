package sonraiguru;

import org.mortbay.util.ajax.JSON;
import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class SplitDates extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub

	
		System.out.println(message.getPayload());
		
		String currentPayload =  message.getPayload().toString();
		String[] dates = currentPayload.split("\"");
		System.out.println(dates);
		String dateFrom = dates[7];
		String dateTo = dates[3];
		
		System.out.println( dateFrom+"   KKKKKKKKKKK   "+ dateTo);
		
		message.setProperty("dateTo",  dateTo, PropertyScope.INVOCATION);
		message.setProperty("dateFrom",  dateFrom, PropertyScope.INVOCATION);
		
		return message;
		
		
		
		
		//Map<String,String> myDetails =  (Map<String,String>) m.getPayload();
		//System.out.println(myDetails);
//		String data = message.getProperty("http.query.string",PropertyScope.INBOUND);
//		System.out.println(data + "LLLLLLLLLLLLLLLLLLLLLLLL");
//		String first = data.split("&")[0];
//		String second = data.split("&")[1];
//		
//		String a = first.split("=")[1];
//		String b = second.split("=")[1];
//		
//		message.setProperty("date_from", a,PropertyScope.SESSION);
//		message.setProperty("date_to", b,PropertyScope.SESSION);
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		
//		
//		return message;
	}

}
