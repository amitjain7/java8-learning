package com.learn.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamListTest2 {
    public static void main(String[] args) {
       List<Student> studentList=getStudentList(200);

       studentList.stream()
               .filter(student -> student.getStAge()>30)
               //.count();
               .forEach(student-> System.out.println(student.getStName() +" :: "+ student.getStAge()));


    }

    public static List<Student> getStudentList(int dataSize){
        List<Student> studentList=new ArrayList<>();
        for(int i=1;i<=dataSize;i++){
            studentList.add(new Student("101"+i,"Amit"+i, getRandomAge()));
        }
        return studentList;
    }

    public static int getRandomAge(){
        Random r = new Random();
        int low = 20;
        int high = 50;
        int result = r.nextInt(high-low) + low;
        return result;
    }
}
