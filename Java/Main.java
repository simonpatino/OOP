class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberPool carrito = new UberPool("ASM212", new Account("mafalda","as"), "toyoya", "2022  ");
        System.out.println(carrito.model);

         //
         
        //carrito.passengenger = 1;
        carrito.setPassenger(5);
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