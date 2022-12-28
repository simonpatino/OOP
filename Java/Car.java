class Car {

    private Integer id;
    private String license;
    private Account driver;
    private Integer passengenger; 

    void printDataCar() {


        System.out.println("Driver name: " + driver.name + "  License   " + license + "   passengers:  " + passengenger );
    }

    public Car(String license,Account driver){
        this.license = license;
        this.driver = driver;
         
    }


    public Integer getPassenger(){

        return passengenger;
    }

    public void setPassenger(Integer passenger){
        if(passenger ==4){
            this.passengenger = passenger;
        }

        else {


            System.out.println("you need exacly 4 pas");
        }

        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    






}

