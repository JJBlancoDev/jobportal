package com.jjblancodev.jobportal.contact.controller;

import com.jjblancodev.jobportal.contact.service.IContactService;
import com.jjblancodev.jobportal.dto.ContactRequestDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/contacts")
@RequiredArgsConstructor
public class ContactController {

    private final IContactService contactService;

    @RequestMapping(version = "1.0", method = RequestMethod.POST)
    public ResponseEntity<String> saveContactMsg(@RequestBody @Valid ContactRequestDto contactRequestDto) {
        boolean isSaved = contactService.saveContact(contactRequestDto);

        if(!isSaved) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error to saved contact");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body("Contact saved");
    }

    @RequestMapping(version = "1.0", method = RequestMethod.GET)
    public ResponseEntity<String> fetchOpenContacts(
            @RequestParam
            @Validated @NotBlank(message = "Status can not be blank")
            @Size(min = 4, message = "Status must be containt min 4 characters")
            String status
    ) {
        return ResponseEntity.ok("Param "+ status);
    }
}
