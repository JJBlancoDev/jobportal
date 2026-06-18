package com.jjblancodev.jobportal.contact.service;

import com.jjblancodev.jobportal.dto.ContactRequestDto;

public interface IContactService {
    boolean saveContact(ContactRequestDto contactRequestDto);
}
