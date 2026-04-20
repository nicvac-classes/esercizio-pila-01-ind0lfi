//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String nome;

        //Creo l'oggetto in per l'input da tastiera
        Scanner in = new Scanner( System.in );

        //Leggo l'input da tastiera
        System.out.print("Inserisci il tuo nome: ");
        nome = in.nextLine();

        //Output del nome acquisito da tastiera
        System.out.println("Ciao "+nome+"!");
        Scanner in=new Scanner(System.in);
        String parola;
        do{
            System.out.println("inserisci parola");
            parola=in.nextLine();
            Pila<Character>pila= new Pila<>();
            for(int i=0;i<parola.lenght();++i){
                pila=push(parola.charAt(i));
            }
            boolean parolaPoli=true;
            for(i=0;i<parola.lenght;++i){
                if(parola.charAt(i)!=pila.pop()){
                    parolaPoli=false;
                }
            }
            if(parolapoli){
                System.out.println("la parola è palindroma");
            }else{
                System.out.println("la parola non è polindroma");
            }
        }while(parola!="x");
    }

    public boolean isEmpty(){
        if(top.dato==null){
            return true;
        }else{
            return false;
        }
    }
    public void push(T dato){
        Nodo<T> nodo=new Nodo<>(dato);
        if(top==null){
            top=nodo;
        }
        top.next=head;
        top=nodo;
    }
    public T pop(){
        if(top==null){
            retrun NoSuchElementEception("lista vuota");
        }
        T dato=top.dato;
        top=top.next;
        return dato;
    }
    public int size(){
        Pila<T> pila2=new Pila<>();
        int c;
        
        try{
            while(true){
                T dato=pila2.pop();
                ++c;

            }chatch(Exception e){
                return c;
            }
        }
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md