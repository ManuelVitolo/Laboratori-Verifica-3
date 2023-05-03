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
     public Docente(Docente p){
    setNome(p.getNome());
    setCognome(p.getCognome());
    setUsername(p.getUsername());
 setUsername(p.getUsername());
     }
     public void setUsername(string username){
         this.username=username;
     }
     
      public void setNome(String nome){
         this.nome=nome;
     }
     
      public void setCognome(String cognome){
         this.cognome=cognome;
     }
     
         public void getUsername(string username){
        return  username;
     }
     
      public void getNome(String nome){
         return   nome;
     }
     
      public void getCognome(String cognome){
         return cognome;
     }

     public void setPassword(String password){
         this.password=password;
     }
     
         public void getPassword(string password){
        return  password;
     }


}
