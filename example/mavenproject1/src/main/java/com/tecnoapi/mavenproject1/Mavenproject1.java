/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tecnoapi.mavenproject1;

import com.tecnoapi.apiintercambiador.Apiintercambiador;
import java.io.IOException;

/**
 *
 * @author marcguell
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        Apiintercambiador ai = new Apiintercambiador("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0aW1lIjoiTW9uIE1heSAzMCAyMDIyIDE2OjQxOjA1IEdNVCswMjAwIChob3JhIGRlIHZlcmFubyBkZSBFdXJvcGEgY2VudHJhbCkiLCJ1c2VySWQiOiI2Mjk0YmM3ZGU1ODVlODhiODYxNzYzZDAiLCJpYXQiOjE2NTM5MjE2NjV9.pqFNn58pI4dlRQGkSQzqQD6CukiZWiX17KEcbFJV-Ew", "123", true);
        
        System.out.println(ai.getProperties());
    }
}
