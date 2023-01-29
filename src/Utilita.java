import java.util.Scanner;

public class Utilita {

  static Scanner sc = new Scanner(System.in);

    /*
    Scrivere un metodo Java per calcolare la somma delle cifre (quindi numeri introdotti in
    formato stringa) contenute in una stringa.
    Esempio: input stringa = de8t9w7a9s7 deve sommare 8+9+7+9+7, riportando il totale e
    quanti numeri sono stati sommati.



     */
  public int sommaNum (){
    int sommaNumeri = 0;
    System.out.println("Inserisci una stringa di parole e numeri");
    System.out.println("Se inserisci numeri,li sommerò tra loro");
    String frase = sc.nextLine();
    for (int i=0; i<frase.length();i++){
      if (Character.isDigit(frase.charAt(i))) {
        sommaNumeri = sommaNumeri + Character.getNumericValue(frase.charAt(i));
      }
      System.out.println("La somma dei numeri è: " + sommaNumeri );
    }
    return sommaNumeri;
  }


 /*
 Scrivi un metodo Java per stampare i caratteri compresi tra due caratteri (ad esempio
inserendo A e F stampa quelli contenuti tra A a F
  */

    public static String inMezzo (){

     /* System.out.println("Inserisci una stringa");
      String stringa = sc.nextLine();

      */
      System.out.println("Inserisci una stringa: ");
      String stringa1 = sc.next();
      int posizione;
      int lunghezza;
      if (stringa1.length() %2 ==0){
        posizione = stringa1.length() / 2 - 1;
        lunghezza = 2;
      }
     else {
       posizione = stringa1.length()/ 2;
       lunghezza=1;
      }
      return stringa1.substring(posizione,posizione+lunghezza);


    }

    /*
Scrivere un metodo Java per visualizzare il carattere centrale di una stringa.
Nota:
a) Se la lunghezza della stringa è dispari ci saranno due caratteri centrali.
b) Se la lunghezza della stringa è pari, ci sarà un carattere centrale
     */

  public static char PrintaCarattCentrale (){
    System.out.println("Inserisciuna stringa");
            String stringa2 = sc.next();
    int lungh = stringa2.length();
    int meta = lungh / 2;
    System.out.println(stringa2.charAt(meta));
    return (char) meta;
  }

  /*
  Scrivere un metodo per sostituire un carattere specificato con un altro carattere
   */
  public void sostituzione(){
    System.out.println("Inserisci una stringa che contenga la lettera \"a\":");
    String stringa3= sc.next();
    String nuovaStringa = stringa3.replace('a','t');
    System.out.println("Stringa originale: " + stringa3);
    System.out.println("Stringa modificata: "+ nuovaStringa);
  }

  /*
  Scrivete un programma per spostare ogni zero a destra di un dato array che contiene
numeri interi. Si deve usare lo stesso array.
   */

 public static void zeroADestra (){
   int arrayN[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
   int n = arrayN.length;
   int contoZeri= 0;
   for(int s=0; s<n;s++){
     if ((arrayN[s] !=0)){
       arrayN[contoZeri++] =arrayN[s];
     }
     while (contoZeri<n)
       arrayN[contoZeri++] = 0;

   }
 }
}

