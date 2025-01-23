public class App {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado("Jose", 30);
        Empleado emp3 = new Empleado();
        Empleado emp4 = new Empleado("Ana", 44);
        Empleado emp5 = new Empleado("Juan", 21);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println(emp5.toString());

        System.out.println("El proximo ID será el " + Empleado.devuelveProximoID());
    }
}
