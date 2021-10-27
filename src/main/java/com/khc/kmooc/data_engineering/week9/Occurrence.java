package com.khc.kmooc.data_engineering.week9;

public class Occurrence {
    private int id;
    private int count;


    public Occurrence(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // HashSet은 2가지 정보가 맞아야지 같은 instance로 인식
    // 첫번째, hashCode
    public int hashCode() {
        return id;
    }

    // 두번째, equals
    public boolean equals(Object obj) {
        Occurrence other = (Occurrence) obj;
        return id == other.getId();
    }
}
