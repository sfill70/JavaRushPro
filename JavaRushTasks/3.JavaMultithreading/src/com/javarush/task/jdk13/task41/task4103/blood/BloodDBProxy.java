package com.javarush.task.jdk13.task41.task4103.blood;

import com.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BloodDBProxy implements DB {

    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() {
        this.security = new SecuritySystem();
        String login = "";
        String password = "";
        System.out.println("Enter login");

        var sysIn = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            login = reader.readLine();
            password = reader.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        security.authorize(login, password);

        if (security.isAuthorized()) {
            db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized()) {
            return db.getById(id);
        }
        return denied;
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized()) {
            return db.find(request);
        }
        List<BloodSample> list = new ArrayList<>();
        list.add(denied);
        return list;
    }
}
