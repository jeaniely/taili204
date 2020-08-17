package com.neuedu.api.object0805.file.controller;

import com.neuedu.api.object0805.file.entry.Student;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private StudentController() {
    }

    static Scanner scanner = new Scanner(System.in);

    /**
     * 添加学生，没有返回值
     *
     * @param students
     */
    public static void addStudent(List<Student> students) {
        Student student = new Student();
        System.out.println("输入学生信息:");
        System.out.println("学生姓名");
        student.setName(scanner.next());
        System.out.println("性别：");
        student.setSex(scanner.next());
        System.out.println("年龄:");
        student.setAge(scanner.nextInt());

        students.add(student);
    }

    /**
     * 根据name进行查找
     *
     * @param students
     * @param name
     * @return -1到集合.size()-1
     */
    private static int findStudent(List<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据name进行数据删除
     *
     * @param students
     * @param name
     * @return null或者删除的数据
     */
    public static Student deleteStudent(List<Student> students, String name) {
        int index = findStudent(students, name);
        if (index == -1) {
            return null;
        } else {
            return students.remove(index);
        }
    }

    /**
     * 修改数据
     *
     * @param students
     * @param name
     * @return 如果成功返回true，失败返回false
     */
    public static boolean updateStudent(List<Student> students, String name) {
        int index = findStudent(students, name);
        if (index == -1) {
            return false;
        } else {
            Student student = students.get(index);
            System.out.println("修改年龄");
            student.setAge(scanner.nextInt());
            students.set(index, student);
            return true;
        }
    }

    /**
     * 将数据存入的文件中
     *
     * @param pathname
     * @param students
     * @return 如果成功返回true，失败返回false
     * @throws IOException
     */
    public static boolean writerFileInfomation(String pathname, List<Student> students) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(students);
        oos.flush();

        oos.close();
        bos.close();
        fos.close();

        return true;
    }

    /**
     * 从文件中读取数据
     *
     * @param pathname
     * @return 如果提取成功，返回的是从文件中提取的对象，不成功返回null
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<Student> readerFileInformation(String pathname) throws IOException, ClassNotFoundException {
        File file = new File(pathname);
        if (!file.exists()) {
            return null;
        }

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        List<Student> students = (List<Student>) ois.readObject();

        ois.close();
        bis.close();
        fis.close();

        return students;
    }



}
