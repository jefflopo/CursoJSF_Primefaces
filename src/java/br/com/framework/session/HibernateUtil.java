/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.framework.session;

import java.io.Serializable;

/**
 * Responsavel por estabelecer a conexao com o Hibernate
 * @author Desenvolvimento
 */
public class HibernateUtil implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    public static String JAVA_COMP_ENV_JDBC_DATA_SOURCE = "java:/comp/env/jdbc/datasource";
    
    private static SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory(){
        
        try{
            
        }catch( Exception e ){
            e.printStackTrace();
            throw new ExceptionInInitializerError("Erro ao criar conexao SessionFactory!!!");
        }
        
    }
    
}
