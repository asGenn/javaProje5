/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprojeodevi;

import java.sql.SQLException;

/**
 *
 * @author UTKU
 */

public class JavaProjeOdevi {
    public static int hata;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        
        AnaSayfa.init();
        try{
            
           Database.dbTableCreateTest();
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        Database.dbTableClear();
        
    }
    
}
