package cc3002.tarea0;

import java.util.Arrays;

public class VectorND {
  private double[] array;
  private int length;

  public VectorND(double[] array) {
    this.array = array;
    this.length = array.length;
  }


  public VectorND(VectorND vector) {
    this.array = vector.array;
    this.length = vector.length;
  }


  public VectorND() {
    this.array = new double[] {};
    this.length = 0;
  }


  public VectorND add(VectorND vector) {
    double[] smaller;
    double[] bigger;
    
    int comparison = longestVector(this, vector);
    smaller = comparison == 1 ? this.getArray() : vector.getArray();
    bigger = comparison == 0 ? this.getArray() : vector.getArray();

    for (int i = 0; i < smaller.length; i++) {
      bigger[i] += smaller[i];
    }

    return new VectorND(bigger);
  }


  public double getLength() {
    double squares = 0;
    for (double dimMagnitude : this.array) {
      squares += Math.pow(dimMagnitude, 2);
    }

    return Math.sqrt(squares);
  }


  public boolean isZeroVector() {
    for(double dimMagnitude : this.array) {
      if (Math.abs(dimMagnitude) <= 0.00001) {
        return false;
      }
    }

    return true;
  }


  public boolean isOppositeTo(VectorND vector) {
    double[] smaller;
    double[] bigger;
    
    int comparison = longestVector(this, vector);
    smaller = comparison == 1 ? this.getArray() : vector.getArray();
    bigger = comparison == 0 ? this.getArray() : vector.getArray();

    for (int i = 0; i < smaller.length; i++) {
      if (!(smaller[i] + bigger[i] < 0.00001)) {
        return false;
      }
    }

    for (int i = smaller.length; i < bigger.length; i++) {
      if (bigger[i] != 0) {
        return false;
      }
    }

    return true;
  }

  
  public double dotProduct(VectorND vector) {
    double sum = 0;
    double[] smaller;
    double[] bigger;
    
    int comparison = longestVector(this, vector);
    smaller = comparison == 1 ? this.getArray() : vector.getArray();
    bigger = comparison == 0 ? this.getArray() : vector.getArray();

    for (int i = 0; i < smaller.length; i++) {
      sum += smaller[i] * bigger[i];
    }

    return sum;
  }


  public double[] getArray() {
    double[] arrayCopy = Arrays.copyOf(this.array, this.length);
    return arrayCopy;
  }


  @Override
  public String toString() {
    return "VectorND{" + Arrays.toString(this.array) + '}';
  }


  public int longestVector(VectorND vec1, VectorND vec2) {
    return vec1.length > vec2.length ? 0 : 1;
  }
}