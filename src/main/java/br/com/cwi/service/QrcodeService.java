/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.service;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import org.springframework.stereotype.Service;

/**
 *
 * @author murillo.goulart
 */
@Service
public class QrcodeService {

    public byte[] generateFrom(String text) {
        return QRCode.from(text)
                .to(ImageType.JPG)
                .withSize(500, 500)
                .stream()
                .toByteArray();
    }
}
