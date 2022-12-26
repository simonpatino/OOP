class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car carrito = new Car("ASM212", new Account("mafalda","as"));
        System.out.println(carrito.driver.name);

         carrito.passengenger = 5;
         carrito.printDataCar();
        // System.out.println("Car License: " + carrito.license);
        // carrito.printDataCar();

        // Car carrito2 = new Car();
        // carrito2.license = "QED123" ;
        // carrito2.driver = "Tornado" ;

        //  System.out.println("Driver name " + carrito2.driver) ;

        // carrito.printDataCar();


    }
}

// the class has to have the same name if the file ˙