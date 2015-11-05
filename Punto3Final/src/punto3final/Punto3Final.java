package punto3final;

public class Punto3Final {

    public static void main(String[] args) {
        String claseA , claseB , claseC , claseD;
        
        //Ejemplo de Herencia Simple
        ClaseBSimple HS = new ClaseBSimple();
        claseA = HS.claseA; claseB = HS.claseB;
        
         HS.mostrar(claseA, claseB);
         
         System.out.println(""); 
         
        //Ejemplo de Herencia Multiple
        ClaseCMultiple HM = new ClaseCMultiple();
         claseA = HM.claseA; claseB = HM.herencia.claseB; claseC = HM.claseC;
         
         HM.mostrar(claseA, claseB, claseC);
        
         System.out.println("");
        
        //Ejemplo de Herencia Multinivel
         ClaseCMultinivel HMN = new ClaseCMultinivel();
         claseA = HMN.claseA; claseB = HMN.claseB; claseC = HMN.claseC;
         
         HMN.mostrar(claseA, claseB, claseC);
         
         System.out.println("");
        
        //Ejemplo de Herencia Jerarquica
         ClaseBJerarquica HJ1 = new ClaseBJerarquica();
         ClaseCJerarquica HJ2 = new ClaseCJerarquica();
         ClaseDJerarquica HJ3 = new ClaseDJerarquica();
         claseA = HJ1.claseA; claseB = HJ1.claseB; claseC = HJ2.claseC; claseD = HJ3.claseD;
         
         HJ1.mostrar(claseA, claseB, claseC, claseD);//Este metodo se puede llamar desde la instancia de cualquiera de las clases HIjas
        
         System.out.println("");
        
        //Ejemplo de Herencia Hibrida
         ClaseDHibrida HH = new ClaseDHibrida();
         claseA = HH.claseA ; claseB = HH.claseB ; claseC = HH.herencia.claseC ; claseD = HH.claseD;
        
         HH.mostrar(claseA, claseB, claseC, claseD);
    }
}
