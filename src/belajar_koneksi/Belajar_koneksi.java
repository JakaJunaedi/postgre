package belajar_koneksi;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Belajar_koneksi {
    public static void main(String[] args) {

        Connection connection=null;

        try {

            Class.forName("org.postgresql.Driver");
            connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "password051455");

            if (connection!=null) {
                System.out.println("konek database ok");
            }else{
                System.out.println("konek tidak");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}