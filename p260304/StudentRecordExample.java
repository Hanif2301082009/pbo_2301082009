/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082009.p260304;

/**
 *
 * @author N I P
 */
public class StudentRecordExample {
    public static void main(String[] Args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Bajo");
        student1.setAddress("Jonggol");
        student1.setAge(20);
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(80);
        ////
        System.out.println("Nama             :"+student1.getName());
        System.out.println("Alamat           :"+student1.getAddress());
        System.out.println("Umur             :"+student1.getAge());
        System.out.println("Matematika       :"+student1.getMathGrade());
        System.out.println("English          :"+student1.getEnglishGrade());
        System.out.println("Science          :"+student1.getScienceGrade());
        System.out.println("Nama             :"+student1.getAverage());
    }
}
