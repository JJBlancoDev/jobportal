package com.jjblancodev.jobportal.scopes;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/scope")
@RequiredArgsConstructor
public class ScopeController {
    private final RequestScopedBean requestScopedBean;
    private final SessionScopedBean sessionScopedBean;

    @GetMapping(path = "/request")
    public ResponseEntity<String> testRequestScope() {
        requestScopedBean.setUsername("Janer Blanco");
        return ResponseEntity.ok(requestScopedBean.getUsername());
    }

    @GetMapping(path = "/session")
    public ResponseEntity<String> testSessionScope() {
        sessionScopedBean.setUsername("Janer Blanco");
        return ResponseEntity.ok(sessionScopedBean.getUsername());
    }

    @GetMapping(path = "/test")
    public ResponseEntity<String> testScope() {
        return ResponseEntity.ok(requestScopedBean.getUsername());
    }
}
