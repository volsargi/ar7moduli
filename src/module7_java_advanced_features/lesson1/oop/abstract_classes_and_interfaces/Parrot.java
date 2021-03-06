package module7_java_advanced_features.lesson1.oop.abstract_classes_and_interfaces;

public class Parrot implements Pet, HelloPet {

    //If class implements few interfaces with the same abstract methods,
    //it must implement this method only once.
    @Override
    public void pet() {
        System.out.println("Hello parrot!");
    }
}
