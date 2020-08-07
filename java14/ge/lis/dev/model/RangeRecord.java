package ge.lis.dev.model;

import java.io.Serializable;

public record RangeRecord (int lo, int hi) implements Serializable {
  public RangeRecord {
    if (lo > hi)
      throw new IllegalArgumentException(String.format("%d, %d", lo, hi));
  }
}
