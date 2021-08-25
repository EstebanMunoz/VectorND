package cc3002.tarea0;
import java.util.Arrays;

public class Vector3D extends VectorND {  
  public Vector3D(double x, double y, double z) {
    super(new double[] {x, y, z});
  }

  public Vector3D crossProduct(Vector3D vector) {
    double first, second, third;

    double[] array1 = this.getArray();
    double[] array2 = vector.getArray();

    first = array1[1]*array2[2] - array1[2]*array2[1];
    second = array1[2]*array2[0] - array1[0]*array2[2];
    third = array1[0]*array2[1] - array1[1]*array2[0];

    return new Vector3D(first, second, third);
  }


  @Override
  public String toString() {
    return "Vector3D{" + Arrays.toString(this.getArray()) + '}';
  }
}