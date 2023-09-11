package COMPANY;

public class inner_outer_class_4 {
    private int outerField = 10;

    // Constructor for outer_outer_class_4
    public inner_outer_class_4() {
        System.out.println("OuterClass constructor");
    }

    // OuterClass method
    public void outerMethod() {
        System.out.println("OuterClass method");
    }

    // InnerClass
    class innerClass {
        private int innerField = 20;

        // InnerClass constructor
        public innerClass() {
            System.out.println("InnerClass constructor");
        }

        // InnerClass method
        public void innerMethod() {
            System.out.println("InnerClass method");
            System.out.println("Accessing outerField from InnerClass: " + outerField);
            outerMethod(); // Calling outer method from InnerClass
        }
    }

    public static void main(String[] args) {
        // Create an instance of outer_outer_class_4
        inner_outer_class_4 outerObj = new inner_outer_class_4();

        // Create an instance of InnerClass
        innerClass innerObj = outerObj.new innerClass();

        // Call methods of InnerClass
        innerObj.innerMethod();
    }
}

