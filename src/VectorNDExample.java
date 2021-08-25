package cc3002.tarea0;

public class VectorNDExample {
  public static void main(String[] args) {
    VectorND vec1 = new VectorND(new double[] {0,1,2,3,4,5});
    VectorND vec2 = new VectorND(new double[] {2,-4,7,6});

    Vector2D vec3 = new Vector2D(-8, 6);

    Vector3D vec4 = new Vector3D(0.7, -1.53, 9);
    Vector3D vec5 = new Vector3D(11.007, 6.641, -3.77);

    System.out.println("Vec1 is " + vec1);
    System.out.println("Vec2 is " + vec2);
    System.out.println();
    System.out.println("Vec3 is " + vec3);
    System.out.println();
    System.out.println("Vec4 is " + vec4);
    System.out.println("Vec5 is " + vec5);
    System.out.println();
    System.out.println("The sum of vec1 + vec2 is " + vec1.add(vec2));
    System.out.println("The norm of vec1 is " + vec1.getLength());
    System.out.println("Vec1 is opposite to vec2: " + vec1.isOppositeTo(vec2));
    System.out.println();
    System.out.println("The dot product of vec1 * vec2 is " + vec1.dotProduct(vec2));
    System.out.println("The cross product of vec4 * vec5 is " + vec4.crossProduct(vec5));
  }
}