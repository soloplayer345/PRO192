
public final class Car {
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;
    
    public Car() throws Exception
    {
        this(null, 100, false, false);
    }
    
    public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake) throws Exception
    {
        this.setColour(Colour);
        this.setEnginePower(EnginePower);
        this.Convertible = Convertible;
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartButton(){
        System.out.println("You can press the star button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You can press the accelerator button");
    }
    
    public void setColour(String Colour){
        String pattern="\\D";
        if (Colour.matches(pattern)) {
            this.Colour=Colour;
        }
        else throw new IllegalArgumentException("Invalid colour format");
    }
    public String getColour(){
        return Colour.toUpperCase();
    }
    
    public void setEnginePower(int EnginePower) {
        if (100<=EnginePower && EnginePower<200) {
            this.EnginePower = EnginePower;
        } else {
            throw new IllegalArgumentException("Invalid colour format");
        }
    }
    public int getEnginePower(){
        return EnginePower;
    }
    
    public void setConvertible(boolean Convertible)
    {
        this.Convertible = Convertible;
    }
    public boolean getConvertible(){
        return Convertible;
    }
    
    public void setParkingBrake(boolean parkingBrake)
    {
        this.parkingBrake = parkingBrake;
    }
    public boolean getParkingBrake(){
        return parkingBrake;
    }

    @Override
    public String toString() {
        return String.format("Colour of car: %s%nEngine Power: %d%nConvertible: %b%nParking Brake: %b%n", getColour(),getEnginePower(),Convertible,parkingBrake);
    }
    public void output(){
        System.out.format("Colour of car: %s%nEngine Power: %d%nConvertible: %b%nParking Brake: %b%n", getColour(),getEnginePower(),Convertible,parkingBrake);
    }
}
