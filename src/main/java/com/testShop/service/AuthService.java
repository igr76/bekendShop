package com.testShop.service;

/** Сервис для регистрации */
public interface AuthService {
    /** Логин и пароль пользователя */
    boolean login(String userName, String password);
    /** регистрация и роль пользователя */
    boolean register(RegisterReq registerReq, Role role);
}

