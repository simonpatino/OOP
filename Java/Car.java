class Car {



    Integer id;
    String license;
    Account driver;
    Integer passengenger; 

    void printDataCar() {

        System.out.println("Driver name: " + driver.name + "  License" + license);
    }


    public Car(String license,Account driver){
        this.license = license;
        this.driver = driver;
        
    }

}

