package com.atguigu.java1;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-22-12:37
 */

interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
        //编译不通过。因为x是不明确的  Reference to 'x' is ambiguous, both 'B.x' and 'A.x' match
//         System.out.println(x);
        System.out.println(super.x);//1
        System.out.println(A.x);//0

    }

    public static void main(String[] args) {
        new C().pX();
    }
}

