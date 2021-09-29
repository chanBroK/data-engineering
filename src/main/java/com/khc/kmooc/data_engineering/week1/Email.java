package com.khc.kmooc.data_engineering.week1;

public class Email {
    public int from;
    public int to;

    public Email(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return from + "->" + to;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return this.from == email.from && this.to == email.to;
    }
}
