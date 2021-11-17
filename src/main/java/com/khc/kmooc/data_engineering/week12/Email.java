package com.khc.kmooc.data_engineering.week12;

import java.util.Objects;

public class Email implements Comparable<Email> {
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
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return this.from == email.from && this.to == email.to;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
        // return from + to;
    }

    @Override
    public int compareTo(Email o) {
        if (from < o.from)
            return -1;
        else if (from == o.from)
            return 0;
        else
            return 1;
    }
}
