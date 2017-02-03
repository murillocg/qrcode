/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.controller;

import br.com.cwi.service.QrcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author murillo.goulart
 */
@RestController
@RequestMapping(path = "/qrcode", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class QrcodeController {
    
    @Autowired
    private QrcodeService qrcodeService;
    
    @GetMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] generate(
            @RequestParam(name = "text", required = true) String text) {
        return qrcodeService.generateFrom(text);
    }
}
