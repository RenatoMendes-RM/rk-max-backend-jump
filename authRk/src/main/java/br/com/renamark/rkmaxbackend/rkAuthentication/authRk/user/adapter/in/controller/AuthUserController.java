package br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.in.controller;




import br.com.renamark.rkmaxbackend.rkauthentication.authrk.appconfig.RkConstants;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/auth")
public class AuthUserController {
    private static final Logger LOGGER = LogManager.getLogger(RkConstants.LOGGER_RK_COMMON);

}


// https://logging.apache.org/log4j/2.x/
