package com.BansalSpring.SpringJpaPractice.Repository;

import com.BansalSpring.SpringJpaPractice.entity.Guardian;
import com.BansalSpring.SpringJpaPractice.entity.Student;
import org.hibernate.dialect.identity.JDataStoreIdentityColumnSupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("ans.bansal@unthinkable.co")
                .firstName("Ansh")
                .lastName("Bansal")
//                .guardianName("xyz")
//                .guardianEmail("xyz@gmail.com")
//                .guardianMobile("8735942432")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian=Guardian.builder()
                .email("qwe")
                .name("edw")
                .mobile("ewfewrf")
                .build();

        Student student=Student.builder()
                .emailId("ans.bansalfv@unthinkable.co")
                .firstName("Anshasd")
                .lastName("Bansals")
                .guardian(guardian)
                .build();
        studentRepository.save(student);

    }
    @Test
    public  void prinAllStudent(){
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("studentList =" + studentList);
    }

    @Test
    public  void printStudentByFirstName(){
        List<Student> studentList=studentRepository.findByFirstName("Ansh");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public  void printStudentByFirstNameContaining(){
        List<Student> studentList=studentRepository.findByFirstName("An");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public  void printGetStudentByEmailAddress(){
        Student studentList=studentRepository.getStudentByEmailAddress("ans.bansalfv@unthinkable.co");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public  void printGetStudentFirstNameByEmailAddress(){
        String studentList=studentRepository.getStudentFirstNameByEmailAddress("ans.bansalfv@unthinkable.co");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public  void printGetStudentByEmailAddressNative(){
        Student studentList=studentRepository.getStudentByEmailAddressNative("ans.bansalfv@unthinkable.co");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public  void printGetStudentByEmailAddressNativeNamedParam(){
        Student studentList=studentRepository.getStudentByEmailAddressNativeNamedParam("ans.bansalfv@unthinkable.co");
        System.out.println("studentList =" + studentList);
    }
    @Test
    public void updateStudentNameByEmailIdTest(){
        studentRepository.updateStudentNameByEmailId(
                "Ansh Ansh",
                "ans.bansalfv@unthinkable.co"
        );
    }
}