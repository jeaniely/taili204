package com.neuedu.api.object0729.two;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {/*按照年龄进行比较*/
        return o1.getAge().compareTo(o2.getAge());
    }
}
