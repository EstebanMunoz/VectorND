package cc3002.tarea0;

public class ZeroVector extends VectorND {
  public ZeroVector() {
    super(new double[] {});
  }


  @Override
  public VectorND add(VectorND vector) {
    return vector;
  }

  @Override
  public boolean isZeroVector() {
    return true;
  }

  @Override
  public boolean isOppositeTo(VectorND vector) {
    return vector.isZeroVector();
  }

  @Override
  public double dotProduct(VectorND vector) {
    return 0;
  }
}