import java.util.function.IntBinaryOperator;

public interface Operation extends IntBinaryOperator {

  default int calculate(int a, int b) {
    return applyAsInt(a, b);
  }
}
