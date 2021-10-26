package br.com.renamark.rkmaxbackend.rkauthentication.authrk.user.adapter.in.controller.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

public class AuthResponseDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("access_token")
    private String rkToken;

    public String getRkToken() {
        return rkToken;
    }

    public void setRkToken(String rkToken) {
        this.rkToken = rkToken;
    }
}

// https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.12.5
// https://www.infobip.com/docs/essentials/api-authentication
// https://github.com/x-Fantasma/Auth-Hexagonal/blob/master/src/main/java/co/pets/auth/application/domain/jwt/JwtDto.java


