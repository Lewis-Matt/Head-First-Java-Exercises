public class Dog {
    String name;

    public static void main(String[] args) {
        // make a Dog object and access it - 'Dog' type is based on class (line 1)
        Dog dog1 = new Dog();
        // Function declared at the bottom of code
        dog1.bark();
        dog1.name = "Bart";

        // Make Dog-type array that has 3 elements
        Dog[] myDogs = new Dog[3];
        // Add dogs to array
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Access the dogs using the array
        // References
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        // What is the name of the dog in Dogs[2]?
        System.out.println("Last dog's name is " + myDogs[2].name);

        // Loop through the array, tell all dogs to bark
        int i = 0;
        while (i < myDogs.length) {
            myDogs[i].bark();
            i++;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }
    // public void eat(){}
    // public void chaseCat(){}
}
