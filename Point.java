public class Point {
  private String nom;
  private int abscisse;
  private int Ordonnée; 

  
  public Point(int l1, int l2) {
    abscisse = l1;
    Ordonnée = l2;
  }


  public Point(String x) {
    nom = x;
  }

 
  public Point(String y, int l3, int l4) {
    nom = y;
    abscisse = l3;
    Ordonnée = l4;
  }

  void Affiche (){
    System.out.println( nom + "(" + abscisse + "," + Ordonnée +")");
  }
 
  boolean Coincide(Point p) {
    return this.abscisse == p.abscisse && this.Ordonnée == p.Ordonnée;
  }
  void TranslHoriz (int a){
     this.abscisse += a;
  }
  void TranslVert (int b){
     this.Ordonnée += b;
  }
  void Translation (int a, int b){
    this.abscisse += a;
    this.Ordonnée += b;
  }
  void setNom(String x){
   this.nom=x;
  }
  void setAbscisse(int a){
    this.abscisse=a;
  }
  void setOrdonnée(int a){
    this.Ordonnée=a;
  }
  String getNom(){
    return nom ;
  }
  int getAbscisse(){
    return abscisse ;
  }
  int getOrdonnée(){
    return Ordonnée ;
  }


}
