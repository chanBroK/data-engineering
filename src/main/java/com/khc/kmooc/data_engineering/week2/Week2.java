package com.khc.kmooc.data_engineering.week2;

import com.khc.kmooc.data_engineering.week1.Email;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Week2 {

    public static void main(String[] args) throws Exception {

        long start = System.currentTimeMillis();
//		origin();
        Email[] data = getData();
        HashSet<Integer> senders = getSenders(data);
        System.out.println("senderCount :" + senders.size());
        if (isExist(data, 265213)) {
            System.out.println("발견");
        } else {

            System.out.println("미발견");
        }
        System.out.println("100000 이전의 수: " + findHigher(data, 100000));
        System.out.println("100000 이후의 수: " + findLower(data, 100000));
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (Email email : data) {
            treeSet.add(email.from);
            treeSet.add(email.to);
        }
        System.out.println("100000 이전의 수: " + treeSet.lower(100000));
        System.out.println("100000 이후의 수: " + treeSet.higher(100000));
        System.out.println("가장 작은 수: " + treeSet.first());
        System.out.println("가장 큰 수: " + treeSet.last());
        System.out.println("소요 시간: " + (System.currentTimeMillis() - start));

    }

    public static Integer findLower(Email[] data, Integer standard) {
        int lower = Integer.MIN_VALUE;
        for (Email email : data) {
            if (email.from < standard && email.from > lower) {
                lower = email.from;
            }
            if (email.to < standard && email.to > lower) {
                lower = email.to;
            }
        }
        return lower;
    }

    public static Integer findHigher(Email[] data, Integer standard) {
        int higher = Integer.MAX_VALUE;
        for (Email email : data) {
            if (email.from > standard && email.from < higher) {
                higher = email.from;
            }
            if (email.to > standard && email.to < higher) {
                higher = email.to;
            }
        }
        return higher;
    }

    public static Boolean isExist(Email[] data, Integer id) {
        for (Email email : data) {
            if (email.from == id) {
                return true;
            }
            if (email.to == id) {
                return true;
            }
        }
        return false;
    }

    public static HashSet<Integer> getSenders(Email[] data) {
        HashSet<Integer> senders = new HashSet<Integer>();
        for (Email email : data) {
            senders.add(email.from);
        }
        return senders;
    }

    public static void origin() throws Exception {
        Email[] data = new Email[420045];
        BufferedReader br = new BufferedReader(
                new FileReader("D:\\project\\eclipse_workspace\\data-engineering\\email.txt"));
        Integer lineCount = 0;
        Integer eventCount = 0;
        Integer minId = Integer.MAX_VALUE;
        Integer maxId = Integer.MIN_VALUE;
        Integer idx = 0;
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            lineCount++;
            if (line.startsWith("#")) {
                continue;
            }
            eventCount++;
            String[] arr = line.split("\t");
            int from = Integer.parseInt(arr[0]);
            int to = Integer.parseInt(arr[1]);
            if (from < minId) {
                minId = from;
            }
            if (to < minId) {
                minId = to;
            }
            if (from > maxId) {
                maxId = from;
            }
            if (to > maxId) {
                maxId = to;
            }
            data[idx] = new Email(from, to);
            System.out.println(data[idx]);
            idx++;
        }
        System.out.println("Line Count : " + lineCount);
        System.out.println("Event Count : " + eventCount);
        System.out.println("minimun ID : " + minId);
        System.out.println("maximum ID : " + maxId);
        System.out.println("Data Size : " + data.length);
        br.close();
    }

    public static Email[] getData() throws Exception {
        BufferedReader br = new BufferedReader(
                new FileReader("D:\\project\\eclipse_workspace\\data-engineering\\email.txt"));
        Email[] data = new Email[420045];
        Integer idx = 0;
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
            data[idx] = new Email(from, to);
            idx++;
        }
        return data;
    }

    public Integer getEventCount(Email[] data) {
        Integer eventCount = 0;
        for (Email email : data) {
            eventCount++;
        }
        return eventCount;
    }

    public Integer getMaxId(Email[] data) {
        Integer maxId = Integer.MIN_VALUE;
        for (Email email : data) {
            if (email.from > maxId) {
                maxId = email.from;
            }
            if (email.to > maxId) {
                maxId = email.to;
            }
        }
        return maxId;
    }

    public Integer getMinId(Email[] data) {
        Integer minId = Integer.MAX_VALUE;
        for (Email email : data) {
            if (email.from < minId) {
                minId = email.from;
            }
            if (email.to < minId) {
                minId = email.to;
            }
        }
        return minId;
    }
}
