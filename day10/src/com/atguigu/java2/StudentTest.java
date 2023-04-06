package com.atguigu.java2;

/**
 * @author philo
 * @Description
 * @email 3424586889@qq.com
 * @Date 2021-09-26-9:48
 */
public class StudentTest {

    public static void main(String[] args) {

        try{
            System.out.println(new Student(100));
            Student s = new Student();
            s.regist(-1001);
            System.out.println(s);
        } catch (Exception e) {
//          e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}

class Student{

    private int id;

    public Student() {
        super();
    }

    public Student(int id) {
        super();
        this.id = id;
    }

    public void regist(int id) throws Exception{
        if(id > 0){
            this.id = id;
        }else{
//			System.out.println("您输入的数据非法！");
            //手动抛出异常对象
//          throw new RuntimeException("您输入的数据非法！");
//          throw new Exception("您输入的数据非法！");
            throw new MyException("不能输入负数");
            //错误的
//			throw new String("不能输入负数");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + "]";
    }


}
