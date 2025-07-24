package practicce;

//Class with different access modifiers
class AccessModifierExampleDemo {

 public int publicVar = 10;
 private int privateVar = 20;
 protected int protectedVar = 30;
 int defaultVar = 40; // default access modifier

 public void publicMethod() {
     System.out.println("Public Method");
 }

 private void privateMethod() {
     System.out.println("Private Method");
 }

 protected void protectedMethod() {
     System.out.println("Protected Method");
 }

 void defaultMethod() {
     System.out.println("Default Method");
 }

 // Method to access private member within the same class
 public void accessPrivate() {
     System.out.println("Accessing privateVar: " + privateVar);
     privateMethod(); // accessing private method
 }
}

//Another class in the same package
class AccessModifierEample {
 public static void main(String[] args) {
     AccessModifierExampleDemo obj = new AccessModifierExampleDemo();

     // Accessing variables
     System.out.println("Public Var: " + obj.publicVar);
     // System.out.println("Private Var: " + obj.privateVar); // ❌ Not allowed
     System.out.println("Protected Var: " + obj.protectedVar);
     System.out.println("Default Var: " + obj.defaultVar);

     // Accessing methods
     obj.publicMethod();
     // obj.privateMethod(); // ❌ Not allowed
     obj.protectedMethod();
     obj.defaultMethod();

     // Accessing private member through public method
     obj.accessPrivate();
 }
}
