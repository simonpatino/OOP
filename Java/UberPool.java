class UberPool extends Car {

    String brand;
    String model;
    private  Integer passenger;

    public UberPool(String license, Account driver, String brand, String model){

        super(license,driver);
        this.brand = brand;
        this.model = model;

    }
//polimorfismo ----->
    @Override
    public void setPassenger(Integer passenger) {
        // TODO Auto-generated method stub
        if(passenger ==6){
            this.passenger = passenger;
        }

        else {


            System.out.println("you need exacly 6 pas");
        }

    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("polimorfismo with methods");
    }
}
