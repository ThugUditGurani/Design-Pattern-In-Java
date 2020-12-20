package com.designpattern.strategydesign;

public interface Authentication {
    public void authenticate();
}

class TokenbasedAuthentication implements Authentication{

    @Override
    public void authenticate() {
        System.out.println("TokenbasedAuthentication Authentication using username and password");
    }
}

class SocialAuthentication implements Authentication{

    @Override
    public void authenticate() {
        System.out.println("Social Authentication using username and password");
    }
}

class PasswordBasedAuthentiation implements Authentication{

    @Override
    public void authenticate() {
        System.out.println("Basic Authentication using username and password");
    }
}
