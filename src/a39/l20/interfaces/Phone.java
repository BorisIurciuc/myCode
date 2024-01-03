package a39.l20.interfaces;
/**
 * Интерфейс Phone предоставляет абстракцию для функционала телефона. Этот интерфейс определяет основные действия, которые должен выполнять телефон.
 */
public interface Phone {
  void makeCall(String number);
  void receiveCall(String caller);
}