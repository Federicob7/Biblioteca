class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale scaffale=new Scaffale("scaffale A");
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro libro1=new Libro("L'ultima legione","Valerio M.Manfredi",15.50f,421,"Mondadori");
        Libro libro2=new Libro("Il fu Mattia Pascal","Luigi Pirandello",12.25f,191,"Feltrinelli");
        Libro libro3=new Libro("Se questo è un uomo","Primo Levi",11.00f,214,"Enaudi");
        Libro libro4=new Libro("Steve Jobs","Walter Isaacson",15.00f,648,"Mondadori");
        Libro libro5=new Libro("Il codice da Vinci","Dan Brown",13.15f,516,"Mondadori");
        scaffale.aggiungi(libro1);
        scaffale.aggiungi(libro2);
        scaffale.aggiungi(libro3);
        scaffale.aggiungi(libro4);
        scaffale.aggiungi(libro5);
        //Visualizzare il contenuto dello scaffale
        System.out.println(scaffale.elencaLibri()+"\n\n");
        System.out.println(scaffale.elencaLibri(autore)+"\n\n");
        
    }
}