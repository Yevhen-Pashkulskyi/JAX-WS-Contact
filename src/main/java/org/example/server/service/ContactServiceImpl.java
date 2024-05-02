package org.example.server.service;

import jakarta.jws.WebService;
import org.example.server.repository.ContactRepository;

import java.util.concurrent.atomic.AtomicInteger;

// Імплементація інтерфейсу Web-сервісу.
@WebService(endpointInterface = "org.example.server.service.ContactService")
public class ContactServiceImpl implements ContactService {

    private static final String GET_CONTACT_KEY = "get";

    @Override
    public String getContactInfo(String req) {
        return ">> Server response:\n" + fetchContactInfo(req);
    }

    private String fetchContactInfo(String req) {
        if (req.equals(GET_CONTACT_KEY)) {
            AtomicInteger count = new AtomicInteger(0);
            StringBuilder stringBuilder = new StringBuilder();
            new ContactRepository().fetchContacts().forEach(contact ->
                    stringBuilder.append(count.incrementAndGet())
                    .append(") ")
                    .append(contact.toString())
            );
            return stringBuilder.toString();
        } else return "No data.";
    }
}
