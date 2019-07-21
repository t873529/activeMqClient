package telus.wfm.activemq.client;

import javax.jms.JMSException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class Controller {

	@RequestMapping(value = "startListener", method = RequestMethod.GET)
	public String startListener() throws JMSException {
		System.out.println("entering startListener() ....");
		String[] args = {};
		Listener.main(args);
		return "startListener";
	}

	@RequestMapping(value = "startPublisher", method = RequestMethod.GET)
	public String startPublisher() throws JMSException {
		System.out.println("entering startPublisher() ....");
		String[] args = {};
		Publisher.main(args);
		return "startPublisher";
	}

}
