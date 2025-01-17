// Prototype Design Pattern
// Prototype design pattern is used when the creation of an object is costly and requires a lot of resources.

class Main {
    // Define an interface `Prototype` which declares a `clone` method
    public interface Prototype {
        Prototype clone(); // This method will be implemented by classes to create a copy of an object
    }

    // Define a class `Student` which implements the `Prototype` interface
    public static class Student implements Prototype {
        // Fields to store student information
        int age;           // Age of the student
        public int rollNumber; // Roll number of the student
        String name;       // Name of the student

        // Constructor to initialize `Student` object
        Student(int age, int rollNumber, String name) {
            this.age = age;               // Set the age
            this.rollNumber = rollNumber; // Set the roll number
            this.name = name;             // Set the name
        }

        // Overriding the `clone` method from `Prototype` interface
        @Override
        public Prototype clone() {
            // Create and return a new `Student` object with the same field values
            return new Student(age, rollNumber, name);
        }
    }

    // Main method - program entry point
    public static void main(String[] args) {
        // Create a `Student` object
        Student obj = new Student(21, 100, "Gopal Jha");
        
        // Call the `clone` method on `obj` to create a copy
        // The returned `Prototype` needs to be typecasted to `Student` because `clone` returns `Prototype`
        Student cloneObj = (Student) obj.clone(); // Typecast Prototype to `Student`

        // Print the `age` field of the original object
        System.out.println(obj.age); // Outputs: 21

        // Print the `age` field of the cloned object to verify the clone worked
        System.out.println(cloneObj.age); // Outputs: 21

        // Print a string message
        System.out.println("Try programiz.pro");
    }
}
