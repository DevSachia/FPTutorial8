import scala.math._

case class Point(a :Int, b:Int){
  var x:Int = a;
  var y:Int = b;
  
  def +(point : Point) = Point(this.x + point.x , this.y + point.y) ;
  
  def move(dx : Int , dy : Int){x = x + dx ; y = y + dy;  println ("Point x location : " + x); println ("Point y location : " + y); }
  
  def distance(point : Point) : Double = sqrt((pow((this.x - point.x),2)+pow((this.y - point.y),2)).abs);
  
  def invert() { x = -x ; y = -y ; println(x,y);}

  
  
}

object Pointtut {
  def main(args: Array[String]){
      var p1 = Point(5,3);
      var p2 = Point(3,1);
      //Q1
      println(p1+p2);
      //Q2
      //p1.move(4,5);
      
      println(p1.x,p1.y);
      
      //Q3
      println(p1.distance(p2));
      
      p1.invert();
      
      

  }
}