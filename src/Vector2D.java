package cc3002.tarea0;
import java.util.Arrays;

public class Vector2D extends VectorND {  
  public Vector2D(double x, double y) {
    super(new double[] {x, y});
  }

  
  @Override
  public String toString() {
    return "Vector2D{" + Arrays.toString(this.getArray()) + '}';
  }
}