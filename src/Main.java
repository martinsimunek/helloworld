//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Zdrojový kód
public class Main {  // pravý Alt+B { ... pravý Alt + N }
    /**
     * Popis metody, která následuje...
     * @param args parametry z příkazové řádky
     */
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Ahoj světe, jak se všichni máte?"); //  Komentáře (naše poznámky)
        System.out.println("To je fajn, že nemusím psát v Poznámkovém bloku... ;)");

        /*
         *  Víceřádkový komentář
         *  Když jeden řádek nestačí... ;)
         */

        // cyklus  // breakpoint
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.print("i = " + i);
            if (i < 5) {
                System.out.println(", ");
            }
        }
    }
}

