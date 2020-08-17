package com.neuedu.api.object0805.file;

import com.neuedu.api.object0805.file.controller.StudentController;
import com.neuedu.api.object0805.file.entry.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    /**
     * 案例：使用文件存储学生信息，并实现增、删、改的功能
     * 分析：
     * 1）多个学生进行存储
     *     首先使用集合存储数据
     *     然后将集合存入文件
     *     List
     * 2） 学生类：姓名，性别，年龄
     * 3）使用方法实现功能
     *   a:增加学生
     *   B：删除学生
     *   C: 修改学生
     *   D:从文件中提取数据
     *   E:将数据存放到文件中
     *
     *
     */
    public static void main(String[] args) {

        List<Student> studentList=new ArrayList<>();



       try {
          studentList=  StudentController.readerFileInformation("d:/demo/dir/student.txt");
             if(studentList!=null){
                 System.out.println(studentList);
             }else{
                 System.out.println("文件不存在");
             }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

      /*  StudentController.addStudent(studentList);
        try {
            boolean flag=  StudentController.writerFileInfomation("d:/demo/dir/student.txt",studentList);
            if(flag){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }



}
