public class Docente{
     private String nome;
     private String cognome;
     private String username;
     private String password;
     public Docente(String nome, String cognome, String username, String password){
    setNome(nome);
    setCognome(cognome);
    setUsername(username);
    setPassword(password);
     }
     
     public void setUsername(String username){
         this.username=username;
     }
     
      public void setNome(String nome){
         this.nome=nome;
     }
     
      public void setCognome(String cognome){
         this.cognome=cognome;
     }
     
         public String getUsername(String username){
        return  username;
     }
     
      public String getNome(String nome){
         return   nome;
     }
     
      public String getCognome(String cognome){
         return cognome;
     }

     public void setPassword(String password){
         this.password=password;
     }
     
         public String getPassword(String password){
        return  password;
     }


}

