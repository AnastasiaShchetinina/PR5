/*package Figure;

public enum Figure {
   CIRCLE(3.303e+23, 2.4397e6),
   SQUARE(4.869e+24, 6.0518e6),
   RECTANGLE(5.976e+24, 6.37814e6),
   private final double mass; // в килограммах
   private final double radius; // в метрах

   Figure(double side1, double side2) {
       this.mass = mass;
       this.radius = radius;
   }

   private double mass() {
       return mass;
   }

   private double radius() {
       return radius;
   }

   // гравитационная постоянная
   public static final double G = 6.67300E-11;

   double Perimeter() {
       return G * mass / (radius * radius);
   }

   double surfaceWeight(double otherMass) {
       return otherMass * surfaceGravity();
   }
} */