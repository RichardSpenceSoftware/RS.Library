package com.softwareinstitute.training.richard.spence;

import static org.junit.jupiter.api.Assertions.*;

class FictionTest {

    @org.junit.jupiter.api.Test
    void getDate() {
        Fiction fiction = new Fiction("Knausguard","2011");
        assertEquals("2012",fiction.getDate());
    }

    @org.junit.jupiter.api.Test
    void testGetDate() {
        Fiction fiction = new Fiction("Knausguard","2011");
        assertEquals("This is the Right one","2012",fiction.getDate());
    }
}