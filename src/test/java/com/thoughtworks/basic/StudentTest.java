package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void shouldReturnStudentIntroduce_test() {
        //given
        Student student = new Student();

        //when
        String actual = student.introduce();
        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
}
