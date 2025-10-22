package br.com.studiesjava.javacore.exception.runtime.tests;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            maybeExeption();
        } catch (SQLException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void maybeExeption() throws SQLException, FileNotFoundException {
    }
}
