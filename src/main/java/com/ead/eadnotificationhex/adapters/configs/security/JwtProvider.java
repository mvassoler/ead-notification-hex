package com.ead.eadnotificationhex.adapters.configs.security;

import io.jsonwebtoken.*;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JwtProvider {

    @Value("${ead.auth.jwtSecret}")
    private String jwtSecret;

    //Recuperar o subject  do token
    public String getSubjectJwt(String token){
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().getSubject();
    }

    public String getClaunNameJwt(String token, String claimName){
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody().get(claimName).toString();
    }

    //Validações do token
    public boolean validateJwt(String authToken){
        try{
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        }catch (SignatureException e){
            log.error("Invalid JWT signature: {}", e.getMessage());
        }catch (MalformedJwtException e){
            log.error("Invalid JWT token: {}", e.getMessage());
        }catch (ExpiredJwtException e){
            log.error("JWT token is expired: {}", e.getMessage());
        }catch (UnsupportedJwtException e){
            log.error("JWT token is unsupported: {}", e.getMessage());
        }catch (IllegalArgumentException e){
            log.error("JWT claims string is empty: {}", e.getMessage());
        }
        return  false;
    }

}
