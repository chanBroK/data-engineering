package com.khc.kmooc.data_engineering.week9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class HashSetExample7 {
    public static HashSet<Integer> getHashSetID() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(from);
            data.add(to);
        }
        br.close();
        return data;
    }

    public static HashSet<Integer> getHashSetSenderIDs() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(from);
        }
        br.close();
        return data;
    }

    public static HashSet<Integer> getHashSetReceiverIDs() throws IOException {
        HashSet<Integer> data = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("D:\\project\\personal\\data-engineering\\email.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            if (line.startsWith("#")) {
                continue;
            }
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            data.add(to);
        }
        br.close();
        return data;
    }

    public static void main(String[] args) throws IOException {
        HashSet<Integer> idSet = getHashSetID();
        HashSet<Integer> senderSet = getHashSetSenderIDs();
        HashSet<Integer> receiverSet = getHashSetReceiverIDs();

        System.out.println("보낸 사람 수:" + senderSet.size());
        System.out.println("받는 사람 수:" + receiverSet.size());

        // 합집합
//        senderSet.addAll(receiverSet);
//        System.out.println("이메일 네트워크에 참여한 사람의 수 :" + senderSet.size());

        //교집합
//        senderSet.retainAll(receiverSet);
//        System.out.println("이메일 보내기도 하고 받기도 한 사람의 수 :" + senderSet.size());

        //차집합
//        senderSet.removeAll(receiverSet);
//        System.out.println("이메일을 보내기만 한 사람의 수 :" + senderSet.size());

        //차집합
        receiverSet.removeAll(senderSet);
        System.out.println("이메일을 받기만 한 사람의 수 :" + receiverSet.size());
    }
}
