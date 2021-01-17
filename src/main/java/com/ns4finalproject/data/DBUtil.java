package com.ns4finalproject.data;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * This class can be used to get an instance of the EntityManagerFactory class,
 * which enables retrieving data using JPA. 
 * 
 * @author Michal Goly
 */
public class DBUtil {
   
   private static final EntityManagerFactory emf = 
           Persistence.createEntityManagerFactory("nsshopPU");
   
   public static EntityManagerFactory getEmFactory() {
      return emf;
   }
}
