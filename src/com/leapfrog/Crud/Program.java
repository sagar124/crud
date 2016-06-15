/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Crud;

import com.leapfrog.Crud.controller.StudentController;
import com.leapfrog.Crud.dao.StudentDAO;
import com.leapfrog.Crud.dao.impl.StudentDAOImpl;
import java.util.Scanner;

/**
 *
 * @author sohn
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentController stdController = new StudentController(studentDAO, input);
        System.out.println("Welcome to Student Management System");

        while (true) {

            stdController.process();

        }
    }
}
