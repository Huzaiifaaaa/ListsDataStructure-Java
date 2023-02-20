public interface GenericInterface<I> {
  // Declare an abstract method that returns a GenericIterator object.
  // The GenericIterator is a parameterized type that iterates over objects of the type I.
  // The method signature has the same name as the interface, which is allowed in Java.
  GLLIterator<I> GenericInterface();
}
