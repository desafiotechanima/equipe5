package com.pontos.pontos.controller;

import com.pontos.pontos.model.dto1;
import com.pontos.pontos.service.PontosService;
import com.pontos.pontos.utils.TokenUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PontosController {

    TokenUtils tokenUtils;
    PontosService service;

    PontosController(TokenUtils tokenUtils, PontosService service){}

    @PostMapping("/pontos")
    public ResponseEntity<String> update(@RequestBody dto1 requestBody ,
                                         @RequestHeader("Authorization") String token){

        String user = tokenUtils.GetUserFromToken(token);

        if ( user == "" ) {
            return new ResponseEntity("Invalid Token", HttpStatus.UNAUTHORIZED);
        }

        if(service.update(requestBody, user, token) == null) {
            return new ResponseEntity("Erro ao processar a requisicao", HttpStatus.INTERNAL_SERVER_ERROR;
        };

        return new ResponseEntity( HttpStatus.OK);
    }

    @GetMapping("/dashboard")
    public ResponseEntity<String> update(@RequestBody dto1 requestBody ,
                                         @RequestHeader("Authorization") String token){

        String user = tokenUtils.GetUserFromToken(token);

        if ( user == "" ) {
            return new ResponseEntity("Invalid Token", HttpStatus.UNAUTHORIZED);
        }

        if(service.update(requestBody, user, token) == null) {
            return new ResponseEntity("Erro ao processar a requisicao", HttpStatus.INTERNAL_SERVER_ERROR;
        };

        return new ResponseEntity( HttpStatus.OK);
    }

    @GetMapping("/ranque")
    public ResponseEntity<String> update(@RequestBody dto1 requestBody ,
                                         @RequestHeader("Authorization") String token){

        String user = tokenUtils.GetUserFromToken(token);

        if ( user == "" ) {
            return new ResponseEntity("Invalid Token", HttpStatus.UNAUTHORIZED);
        }

        if(service.update(requestBody, user, token) == null) {
            return new ResponseEntity("Erro ao processar a requisicao", HttpStatus.INTERNAL_SERVER_ERROR;
        };

        return new ResponseEntity( HttpStatus.OK);
    }

}
