package com.learn.java8.others;

import com.learn.java8.stream.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UseOfCollectorsForGroupingTest6 {
    public static void main(String[] args) {
     List<Student> studentNames=getStudentList(5);

        Map<String,Long> groupData= studentNames.stream()
                .map(student->student.getStName())
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        groupData.forEach((name,count)-> System.out.println("name- "+name+" :: count-"+count));


    }

    public static List<com.learn.java8.stream.Student> getStudentList(int dataSize){
        List<com.learn.java8.stream.Student> studentList=new ArrayList<>();
        for(int i=1;i<=dataSize;i++){
            studentList.add(new com.learn.java8.stream.Student("101"+i,"Amit"+i, getRandomAge()));
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


