package punto3final;

// La definición de clase Línea
public class Line {
  // Variables miembro privadas 
   point comenzar, terminar;   // Declaramos comienzan y terminan como instancias de Punto
 
   // Constructores
   public Line (int x1, int y1, int x2, int y2) {
      comenzar = new point (x1, y1); // Construir instancias Point
      terminar = new point (x2, y2);
   }
   
   public Line (point comenzar, point terminar) {
      this.comenzar = comenzar;   //casos Point construidos
      this.terminar = terminar;
   }
   
   // GetVariable y setVariable para Publicar variables privadas
   public point getComensar () {
      return comenzar;
   }
   public point getTerminar () {
      return terminar;
   }
   public void setComenzar (point  comenzar) {
      this.comenzar = comenzar;
   }
   public void setTerminar (point terminar) {
      this.terminar = terminar;
   }
 
   public int getComenzarX () {
      return comenzar.getX ();
   }
   public void setComenzarX (int x) {
      comenzar.setX (x);
   }
   
   public int getComenzarY () {
      return comenzar.getY ();
   }
   public void setComenzarY (int y) {
      comenzar.setY (y);
   }
   public void setComenzarXY  (int x, int y) {
      comenzar.setX (x);
      comenzar.setY (y);
   }
   public int getTerminarX () {
      return terminar.getX ();
   }
   public void setTerminarX (int x) {
      terminar.setX (x);
   }
   public int getTerminarY () {
      return terminar.getY ();
   }
   public void setTerminarY (int y) {
      terminar.setY (y);
   }
   public void setTerminarXY (int x, int y) {
      terminar.setX (x);
      terminar.setY (y);
   }
 
   public String toString () {
      return "Línea de" + comenzar + "a" + terminar;
   }
 
    public double getLength () {
      int Xdif = comenzar.getX () - terminar.getX ();
      int yDiff = comenzar.getY () - terminar.getY ();
      return Math.sqrt (Xdif * Xdif + yDiff * yDiff);
   }
}
