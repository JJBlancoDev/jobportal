package com.jjblancodev.jobportal.contact.service.impl;

import com.jjblancodev.jobportal.contact.service.IContactService;
import com.jjblancodev.jobportal.dto.ContactRequestDto;
import com.jjblancodev.jobportal.entity.Contact;
import com.jjblancodev.jobportal.repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements IContactService {

    private final ContactRepository contactRepository;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        Contact contactSave = contactRepository.save(transformToEntity(contactRequestDto));
        return contactSave.getId() != null;
    }

    private Contact transformToEntity(ContactRequestDto contactRequestDto) {
        Contact contact = new Contact();
        BeanUtils.copyProperties(contactRequestDto, contact); // Copy the equals properties of contactRequestDto to contact.
        contact.setStatus("NEW");
        return contact;
    }

}
