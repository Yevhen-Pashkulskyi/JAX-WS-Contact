package org.example.client.api;

import jakarta.xml.ws.Service;
import org.example.server.service.ContactService;
import org.example.client.utils.Constants;

import javax.xml.namespace.QName;
import java.net.URI;
import java.net.URL;

public class ContactClient {
    public String runClient(String request) throws Exception {
        URL url = URI.create(Constants.WSDL_URL).toURL();
        QName qname = new QName("http://service.server.example.org/",
                "ContactServiceImplService");

        Service service = Service.create(url, qname);
        ContactService contactService = service.getPort(ContactService.class);
        return contactService.getContactInfo(request);
    }
}
