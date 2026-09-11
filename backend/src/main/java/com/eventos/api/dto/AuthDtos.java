package com.eventos.api.dto;
import javax.validation.constraints.*;
public class AuthDtos { public static class Register { @NotBlank public String name; @Email @NotBlank public String email; @Size(min=6) public String password; } public static class Login { @Email @NotBlank public String email; @NotBlank public String password; } public static class Token { public String token,name; public Token(String token,String name){this.token=token;this.name=name;} } }
