package com.soojong.sort;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // 결과가 양수면 첫번째 파라미터가 두번째 파라미터보다 after
        // 결과가 음수면 첫번째 파라미터가 두번째 파라미터보다 before

        if (student1.getId() ==  student2.getId()){
            return 0;
        }else if (student1.getId() > student2.getId()){
            return 1;
        } else {
            return -1;
        }
    }
}
