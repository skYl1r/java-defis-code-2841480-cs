import java.util.Objects;

public class OperatorFactory {

  private static OperatorFactory factory;

  private Operation plusOperator;

  private Operation minusOperator;

  private Operation multiplyOperator;

  private Operation divideOperator;

  public static OperatorFactory getInstance() {
    if (Objects.isNull(factory)) {
      factory = new OperatorFactory();
    }
    return factory;
  }

  private OperatorFactory() {
    this.plusOperator = (a, b) -> a + b;
    this.minusOperator = (a, b) -> a - b;
    this.multiplyOperator = (a, b) -> a * b;
    this.divideOperator = (a, b) -> a / b;
  }

  public Operation resolveOperation(char operation) {
    switch (operation) {
      case '+':
        return plusOperator;
      case '-':
        return minusOperator;
      case '*':
        return multiplyOperator;
      default:
        return divideOperator;
    }
  }
}
