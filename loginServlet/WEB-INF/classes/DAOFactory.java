package com.st.dao;

public class DAOFactory {
   private static UserDAOI udao;  
   static {
    udao = new UserDAO();
   } 

   public static UserDAOI getUserDAO() {
    return udao;
   }
}
