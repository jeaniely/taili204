package com.neuedu.objectexample02.three;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[5];
     /*   students[0]=new Computer("c001","lili","m",21,90,88,90,88);
        students[1]=new English("e001","max","m",21,94,88,91);
        students[2]=new Literature("L001","jeanie","w",22,85,88,91,87);
        students[3]=new Computer("c002","zhang","m",23,90,81,84,78);
        students[4]=new Computer("c004","anan","w",18,87,85,91,88);
*/
        Scanner scanner=new Scanner(System.in);
     for(int i=0;i<students.length;i++){
         System.out.println("第"+(i+1)+"位学生信息输入：");
         if(i%2==0){
             Computer student=new Computer();
             System.out.println("学号");
             student.setSid(scanner.next());
             System.out.println("姓名");
             student.setName(scanner.next());
             System.out.println("性别");
             student.setSex(scanner.next());
             System.out.println("年龄");
             student.setAge(scanner.nextInt());
             System.out.println("操作");
             student.setOperation(scanner.nextDouble());
             System.out.println("英语写作");
             student.setEnglishWrite(scanner.nextDouble());
             System.out.println("期中成绩");
             student.setMiddleTerm(scanner.nextDouble());
             System.out.println("期末成绩");
             student.setFinalTerm(scanner.nextDouble());

             students[i]=student;
         }else if(i%3==0){
             English student=new English();
             System.out.println("学号");
             student.setSid(scanner.next());
             System.out.println("姓名");
             student.setName(scanner.next());
             System.out.println("性别");
             student.setSex(scanner.next());
             System.out.println("年龄");
             student.setAge(scanner.nextInt());
             System.out.println("演讲");
             student.setSpeech(scanner.nextDouble());

             System.out.println("期中成绩");
             student.setMiddleTerm(scanner.nextDouble());
             System.out.println("期末成绩");
             student.setFinalTerm(scanner.nextDouble());

             students[i]=student;
         }else{
             Literature student=new Literature();
             System.out.println("学号");
             student.setSid(scanner.next());
             System.out.println("姓名");
             student.setName(scanner.next());
             System.out.println("性别");
             student.setSex(scanner.next());
             System.out.println("年龄");
             student.setAge(scanner.nextInt());
             System.out.println("演讲");
             student.setSpeech(scanner.nextDouble());
             System.out.println("作品");
             student.setWorks(scanner.nextDouble());
             System.out.println("期中成绩");
             student.setMiddleTerm(scanner.nextDouble());
             System.out.println("期末成绩");
             student.setFinalTerm(scanner.nextDouble());

             students[i]=student;
         }
     }
        for(Student s:students){
            s.showAll();
        }

    }
}
