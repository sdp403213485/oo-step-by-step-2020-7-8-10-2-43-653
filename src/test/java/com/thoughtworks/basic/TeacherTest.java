package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void shouldReturnStudentIntroduce_test() {
        //given
        Teacher teacher= new Teacher();

        //when
        String actual = teacher.introduce();
        //then
        assertEquals(actual,"My name is Tom. I am 21 years old.I am a Teacher.");
    }
}
