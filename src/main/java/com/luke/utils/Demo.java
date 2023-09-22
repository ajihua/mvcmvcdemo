package com.luke.utils;

import com.luke.entity.UserMessage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {
        File file = new File("d:/logs/history.2022-07-25.log");
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        List<UserMessage> list = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
            String[] strs = line.split("\\|");
            UserMessage userMessage = new UserMessage();
            userMessage.setHead(strs[0]);
            userMessage.setIp(strs[1]);
            userMessage.setUrl(strs[2]);
            userMessage.setClient(strs[3]);
            list.add(userMessage);
        }
        reader.close();
        int x = 0;


    }
}
